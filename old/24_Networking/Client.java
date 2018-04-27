/* Client.java */
// Client class reads and display info sent from Server class
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends JFrame {
  private JTextField enter = new JTextField(); // enter info from user
  private JTextArea display= new JTextArea();  // display info to user
  private ObjectOutputStream output; // output stream to Server...
  private ObjectInputStream input;   // ...and from Server
  private String msg = "",           // message from Server
    chatServer;                      // host Server for this app;
  private Socket client;             // Socket to Server

  // Utility func to dispay msg in event-dispatch thread
  private void displayMessage(final String msgToDisplay) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // Update display
          display.append(msgToDisplay);
        }
    });
  }

  // Util func to manipulate enter field in event-dispatch thread
  private void setTextFieldEditable(final boolean editable) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // set enter's editability
          enter.setEditable(editable);
        }
    });
  }

  // Send msg to Server
  private void sendData(String msg) {
    try {
      output.writeObject("CLIENT > " + msg);
      output.flush();
      displayMessage("\nCLIENT > " + msg);
    } catch (IOException ioEx) {
      display.append("\nError writing object");
    }
  }
  
  // Constr-- init chatServer and set up GUI
  public Client(String host) {
    super("Client");

    chatServer = host;
    enter.setEditable(false);
    enter.addActionListener(new ActionListener() {
        // Send msg to Server
        public void actionPerformed(ActionEvent e) {
          sendData(e.getActionCommand());
          enter.setText("");
        }
    });;

    add(enter, BorderLayout.NORTH);
    add(new JScrollPane(display), BorderLayout.CENTER);
    setSize(400, 150);
    setVisible(true);
  }
  
  // Connect to Server
  private void connectToServer() throws IOException {
    displayMessage("Attempting connection...\n");

    // Create socket to make connection to server
    client = new Socket(InetAddress.getByName(chatServer), 12345);

    // Display connection info
    displayMessage("Connected to: " + client.getInetAddress().getHostName());
  }

  // Get streams to send/recv data
  private void getStreams() throws IOException {
    // Set up output stream for objs
    output = new ObjectOutputStream(client.getOutputStream());
    output.flush();

    // ...and input
    input = new ObjectInputStream(client.getInputStream());
    displayMessage("\nGot I/O streams\n");
  }

  // Process connection w Server
  private void processConnection() throws IOException {
    // enable enter so client user can send msgs
    setTextFieldEditable(true);

    do {
      try {
        msg = (String) input.readObject();
        displayMessage("\n" + msg);
      } catch (ClassNotFoundException cnfEx) {
        displayMessage("\nUnknown object type received");
      }
    } while (!msg.equals("SERVER> TERMINATE"));
  }

  // Close streams, socket
  private void closeConnection() {
    displayMessage("\nClosing Connection");
    setTextFieldEditable(false);

    try {
      output.close();
      input.close();
      client.close();
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
  }
  // Connect to Server and process msgs from Server
  public void runClient() {
    try {
      connectToServer();
      getStreams();
      processConnection();
    } catch (EOFException eofEx) {
      displayMessage("\nClient terminated connection");
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    } finally {
      closeConnection();
    }
  }
}
