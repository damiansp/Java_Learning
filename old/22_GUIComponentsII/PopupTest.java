/* PopupTest.java */
import javax.swing.JFrame;

public class PopupTest {
  public static void main(String[] args) {
    PopupFrame puf = new PopupFrame();

    puf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    puf.setSize(300, 200);
    puf.setVisible(true);
  }
}
