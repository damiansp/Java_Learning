/* TicTacToeServer.java */
// Maintains Tic-Tac-Toe games for two clients
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TicTacToeServer extends JFrame {
  private String[] board = new String[9]; // board representation
  private JTextArea outputArea = new JTextArea();
  private Player[] players = new Player[2]; 
  private ServerSocket server;
  private final static int PLAYER_X = 0,
    PLAYER_O = 1;
  private int currentPlayer = PLAYER_X;
  private final static String[] MARKS = { "X", "O" };
  // run players; thread for ea player
  private ExecutorService runGame = Executors.newFixedThreadPool(2); 
  private Lock gameLock = new ReentrantLock(); // lock game for synchronization
  // wait for other player to connect
  private Condition otherPlayerConnected = gameLock.newCondition(),
  // wait for other player to play
    otherPlayerTurn = gameLock.newCondition();

  // Set up tic-tac-toe server and GUI to display msgs
  public TicTacToeServer() {
    super("Tizic Tizac Tizoe");

    for (int i = 0; i < 9; i++) {
      board[i] = new String(""); // init board
    }

    try {
      server = new ServerSocket(12345, 2);
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
      System.exit(1);
    }

    add(outputArea, BorderLayout.CENTER);
    outputArea.setText("Server awaiting connections\n");
    setSize(400, 400);
    setVisible(true);
  }

  // Wait for 2 connections so game can be played
  public void execute() {
    // wait for client to connect
    for (int i = 0; i < players.length; i++) {
      try {
        // wait for connection; create Player; start runnable
        players[i] = new Player(server.accept(), i);
        runGame.execute(players[i]);
      } catch (IOException ioEx) {
        ioEx.printStackTrace();
        System.exit(1);
      }
    }

    gameLock.lock(); // lock game to signal PLAYER_X's thread

    try {
      players[PLAYER_X].setSuspended(false); // resume PLAYER_X
      otherPlayerConnected.signal();         // wake up PLAYER_X's thread
    } finally {
      gameLock.unlock(); // unlock after signaling PLAYER_X
    }
  }

  // Display msg to outputArea
  private void displayMessage(final String msgToDisplay) {
    // display msg fr event-dispatch thread of execution
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // update outputArea: add msg
          outputArea.append(msgToDisplay);
        }
    });
  }

  // Validate move
  public boolean validateAndMove(int location, int player) {
    // While not current player, wait turn
    while (player != currentPlayer) {
      gameLock.lock(); // lock for other player's turn

      try {
        otherPlayerTurn.await();
      } catch (InterruptedException iEx) {
        iEx.printStackTrace();
      } finally {
        gameLock.unlock();
      }
    }

    // if location not occupied, make move
    if (!isOccupied(location)) {
      board[location] = MARKS[currentPlayer];
      currentPlayer = (currentPlayer + 1) % 2; // change players

      // Alert new current player that move occurred
      players[currentPlayer].otherPlayerMoved(location);
      gameLock.lock(); // lock to signal other player to go

      try {
        otherPlayerTurn.signal();
      } finally {
        gameLock.unlock(); // unlock after signalling
      }

      return true;
    } else {
      // move not valid
      return false;
    }
  }

  // Determine if location occupied
  public boolean isOccupied(int location) {
    if (board[location].equals(MARKS[PLAYER_X])
        || board[location].equals(MARKS[PLAYER_O])) {
      return true;
    } else {
      return false;
    }
  }

  // Determine game over status
  public boolean isGameOver() {
    // TO DO
    return false;
  }

  // Player inner class: manage ea Player as a runnable
  private class Player implements Runnable {
    private Socket connection;
    private Scanner input;
    private Formatter output;
    private int playerNumber;
    private String mark;
    private boolean suspended = true;

    // Constr (Set up Player thread)
    public Player(Socket socket, int number) {
      playerNumber = number;
      mark = MARKS[playerNumber];
      connection = socket;

      try {
        // obtain socket streams
        input = new Scanner(connection.getInputStream());
        output = new Formatter(connection.getOutputStream());
      } catch(IOException ioEx) {
        ioEx.printStackTrace();
        System.exit(1);
      }
    }

    // Send msg that other player moved
    public void otherPlayerMoved(int location) {
      output.format("Opponent moved\n%d\n", location);
      output.flush();
    }

    // Control thread's execution
    public void run() {
      // Send client its mark (X or O), process msg from client
      try {
        displayMessage("Player " + mark + " connected\n");
        output.format("%s\n", mark); // send player's mark
        output.flush();

        // if PLAYER_X, wait for another player to join
        if (playerNumber == PLAYER_X) {
          output.format("Player X connected\nWaiting for 2nd player\n");
          output.flush();
          gameLock.lock(); // until 2nd player joins

          try {
            while (suspended) {
              otherPlayerConnected.await(); // wait for O to join
            }
          } catch (InterruptedException iEx) {
            iEx.printStackTrace();
          } finally {
            gameLock.unlock(); // 2nd player joined
          }

          // Alert that other player connected
          output.format("Another player has joined. Your move.\n");
          output.flush();
        } else {
          output.format("Player O connected, please wait.\n");
          output.flush();
        }

        while (!isGameOver()) {
          int location = 0; // init

          if (input.hasNext()) {
            location = input.nextInt();
          }

          // Validate move
          if (validateAndMove(location, playerNumber)) {
            displayMessage("\nlocation: " + location);
            output.format("Valid move.\n");
            output.flush();
          } else {
            // invalid move
            output.format("Invalid move.  Try another spot.\n");
            output.flush();
          }
        }
      } finally {
        try {
          connection.close();
        } catch (IOException ioEx) {
          ioEx.printStackTrace();
          System.exit(1);
        }
      }
    } // run()

    // set/unset thread suspended
    public void setSuspended(boolean status) {
      suspended = status;
    }
  }
}
