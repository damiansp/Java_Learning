/* ClientTest.java */
import javax.swing.JFrame;

public class ClientTest {
  public static void main(String[] args) {
    Client app;

    // If no command line args
    if (args.length == 0) {
      app = new Client("127.0.0.1"); // connect to localhost
    } else {
      app = new Client(args[0]);
    }

    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.runClient();
  }
}
