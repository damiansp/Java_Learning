/* TicTacToeClientTest.java */
import javax.swing.JFrame;

public class TicTacToeClientTest {
  public static void main(String[] args) {
    TicTacToeClient tttClient;

    // If no command line args
    if (args.length == 0) {
      tttClient = new TicTacToeClient("127.0.0.1");
    } else {
      tttClient = new TicTacToeClient(args[0]);
    }

    tttClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
