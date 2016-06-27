// TextFieldFrameTest.java
// Test TextFieldFrame class
import javax.swing.JFrame;

public class TextFieldFrameTest {
  public static void main(String[] args) {
    TextFieldFrame tff = new TextFieldFrame();
    tff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tff.setSize(350, 150);
    tff.setVisible(true);
  }
}
