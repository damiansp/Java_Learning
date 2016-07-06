// ListFrameTest.java
// Test ListFrame -- selecting colors from JList
import javax.swing.JFrame;

public class ListFrameTest {
  public static void main(String[] args) {
    ListFrame lf = new ListFrame();
    lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lf.setSize(350, 150);
    lf.setVisible(true);
  }
}
