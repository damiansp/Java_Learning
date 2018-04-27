/* TicTacToeClient.java */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TicTacToeClient extends JFrame implements Runnable {
  private JPanel boardPanel = new JPanel(), // for ttt board
    panel2 = new JPanel();                  // holds board
  private JTextArea displayArea = new JTextArea(4, 30);
  private JTextField idField = new JTextField();;
  private Square board[][] = new Square[3][3],  // ttt board
    currentSquare;
  private Scanner input;
  private Formatter output;
  private Socket connection;
  private String ticTacToeHost,
    myMark;
  private final String X_MARK = "X";
  private final String O_MARK = "O";
  private boolean myTurn;

  // Constr-- Set up board and UI
  public TicTacToeClient(String host) {
    ticTacToeHost = host; // name of server
    displayArea.setEditable(false);
    add(new JScrollPane(displayArea), BorderLayout.SOUTH);
    boardPanel.setLayout(new GridLayout(3, 3, 0, 0));
    
    // loop over rows of board...
    for (int r = 0; r < board.length; r++) {
      // ...and cols
      for (int c = 0; c < board[r].length; c++) {
        // Create squares
        board[r][c] = new Square(" ", r * 3 + c);
        boardPanel.add(board[r][c]);
      }
    }

    idField.setEditable(false);
    add(idField, BorderLayout.NORTH);
    panel2.add(boardPanel, BorderLayout.CENTER);
    add(panel2, BorderLayout.CENTER);
    setSize(300, 225);
    setVisible(true);
    startClient();
  }

  // Start client thread
  public void startClient() {
    try {
      // Connect to server; get streams; start outputThread
      connection = new Socket(InetAddress.getByName(ticTacToeHost), 12345);
      input = new Scanner(connection.getInputStream());
      output = new Formatter(connection.getOutputStream());
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }

    // Create and start worker thread for this client
    ExecutorService worker = Executors.newFixedThreadPool(1);
    worker.execute(this);
  }

  // Control thread that allows continuous update of displayArea
  public void run() {
    myMark = input.nextLine(); // get players mark (X/O)

    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // Display player's mark
          idField.setText("You are player \"" + myMark + "\"");
        }
    });

    myTurn = (myMark.equals(X_MARK));

    // Rcv msgs sent to client and output them
    while (true) {
      if (input.hasNextLine()) {
        processMessage(input.nextLine());
      }
    }
  }

  // Process msgs rcved by client
  private void processMessage(String message) {
    // Valid move occurred
    if (message.equals("Valid move.")) {
      displayMessage("Valid move. Please wait...\n");
      setMark(currentSquare, myMark);
    } else if (message.equals("Invalid move. Try another spot.")) {
      displayMessage(message + "\n");
      myTurn = true;
    } else if (message.equals("Opponent moved")) {
      int location = input.nextInt();
      input.nextLine();
      int row = location / 3,
        col = location % 3;

      setMark(board[row][col], (myMark.equals(X_MARK) ? O_MARK : X_MARK));
      displayMessage("Opponent moved. Your turn.\n");
      myTurn = true;
    } else {
      displayMessage(message + "\n");
    }
  }

  // Manipulate outputArea in event-dispatch thread
  private void displayMessage(final String msgToDisplay) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          displayArea.append(msgToDisplay);
        }
    });
  }

  // Util method to set mark on board in event-dispatch thread
  private void setMark(final Square squareToMark, final String mark) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          squareToMark.setMark(mark);
        }
    });
  }

  // Send msg to server indicating square clicked
  public void sendClickedSquare(int location) {
    if (myTurn) {
      output.format("%d\n", location);
      output.flush();
      myTurn = false;
    }
  }

  // Set current Square
  public void setCurrentSquare(Square square) {
    currentSquare = square;
  }


  
  // Private inner class for squares on board
  private class Square extends JPanel {
    private String mark; // X/O
    private int location;

    // Constr
    public Square(String squareMark, int squareLocation) {
      mark = squareMark;
      location = squareLocation;

      addMouseListener(new MouseAdapter() {
          public void mouseReleased(MouseEvent e) {
            setCurrentSquare(Square.this);

            // Send location of this Square
            sendClickedSquare(getSquareLocation());
          }
      });
    }

    // Acc
    public void setMark(String newMark) {
      mark = newMark;
      repaint();
    }

    public int getSquareLocation() { return location; }
    
    // Return pref size of Square
    public Dimension getPreferredSize() {
      return new Dimension(30, 30);
    }

    // min Square size
    public Dimension getMinumumSize() {
      return getPreferredSize();
    }

    // Draw square
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawRect(0, 0, 29, 29);
      g.drawString(mark, 11, 20); // draw mark
    }
  }
}
