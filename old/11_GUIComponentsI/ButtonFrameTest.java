// ButtonFrameTest.java
// Test ButtonFrame class
import javax.swing.JFrame;

public class ButtonFrameTest {
  public static void main(String[] args) {
    ButtonFrame buttonFrame = new ButtonFrame();
    buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    buttonFrame.setSize(500, 270);
    buttonFrame.setVisible(true);
  }
}
