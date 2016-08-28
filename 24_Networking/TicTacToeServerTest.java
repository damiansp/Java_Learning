/* TicTacToeServerTest.java */
import javax.swing.JFrame;

public class TicTacToeServerTest {
  public static void main(String[] args) {
    TicTacToeServer ttt = new TicTacToeServer();

    ttt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ttt.execute();
  }
}
