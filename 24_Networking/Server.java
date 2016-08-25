/* Server.java */
// A basic server class
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame {
  private JTextField enterField = new JTextField(); // input msg fr user
  private JTextArea displayArea = new JTextArea(); // display info to user
  private ObjectOutputStream output; // output stream to client...
  private ObjectInputStream input;   // ...and from client
  private ServerSocket server;
  private Socket connection;
  private int counter = 1;           // no. of connections

  // Constr-- GUI setup
  public Server() {
    super("Server");
    enterField.setEditable(false);
    enterField.addActionListener(new ActionListener() {
        // Send msg to client
        public void actionPerformed(ActionEvent e) {
          sendData(e.getActionCommand());
          enterField.setText("");
        }
    });

    add(enterField, BorderLayout.NORTH);
    add(new JScrollPane(displayArea), BorderLayout.CENTER);
    setSize(300, 150);
    setVisible(true);
  }
  
  // Set up and run server
  public void runServer() {
    try {
      server = new ServerSocket(12345, 100); // ServerSocket(port, queueLength)

      while (true) {
        try { 
          waitForConnection();
          getStreams();
          processConnection();
        } catch (EOFException eofEx) {
          displayMessage("\nServer terminated connection");
        } finally {
          closeConnection();
          counter++;
        }
      }
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
  }

  // Wait for connection, then display connection info
  private void waitForConnection() throws IOException {
    displayMessage("Waiting for connection...");
    connection = server.accept();
    displayMessage("Connection " + counter + " received from: " +
                   connection.getInetAddress().getHostName());
  }

  // Get streams to send and receive data
  private void getStreams() throws IOException {
    // Set up output stream for objs...
    output = new ObjectOutputStream(connection.getOutputStream());
    output.flush();

    // ...and input stream
    input = new ObjectInputStream(connection.getInputStream());
    displayMessage("\nGot I/O streams\n");
  }

  // Process client connection
  private void processConnection() throws IOException {
    String message = "Connection successful";
    sendData(message);

    // Enable enterField so user can send msgs
    setTextFieldEditable(true);

    // Process msg sent from client
    do {
      try {
        // Read and display msg
        message = (String) input.readObject(); // reads msg
        displayMessage("\n" + message);
      } catch (ClassNotFoundException cnfEx) {
        displayMessage("\nUnknown object type received");
      }
    } while (!message.equals("CLENT > TERMINATE"));
  }

  // Close streams, socket
  private void closeConnection() {
    displayMessage("\nTerminating connection\n");
    setTextFieldEditable(false); // disable enterField

    try {
      output.close();
      input.close();
      connection.close();
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
  }

  // Send msg to client
  private void sendData(String message) {
    try {
      output.writeObject("SERVER > " + message);
      output.flush();
      displayMessage("\nSERVER > " + message);
    } catch (IOException ioEx) {
      displayArea.append("\nError writing object");
    }
  }

  // Manipulate displayArea in the event-dispatch thread
  private void displayMessage(final String messageToDisplay) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // update displayArea
          displayArea.append(messageToDisplay);
        }
    });
  }

  // Manipulate enterField in event-dispatch thread
  private void setTextFieldEditable(final boolean editable) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // set enterField's editability
          enterField.setEditable(editable);
        }
    });
  }
}
