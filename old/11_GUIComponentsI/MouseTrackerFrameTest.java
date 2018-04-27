/* MouseTrackerFrameTest.java */
// Test MouseTrackerFrame
import javax.swing.JFrame;

public class MouseTrackerFrameTest {
  public static void main(String[] args) {
    MouseTrackerFrame mtf = new MouseTrackerFrame();
    mtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mtf.setSize(300, 100);
    mtf.setVisible(true);
  }
}
