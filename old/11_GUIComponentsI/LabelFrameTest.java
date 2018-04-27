// LabelFrameTest.java
// Testing LabelFrame class
import javax.swing.JFrame;

public class LabelFrameTest {
  public static void main(String[] args) {
    LabelFrame labelFrame = new LabelFrame();
    labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    labelFrame.setSize(500, 550);
    labelFrame.setVisible(true);
  }
}
