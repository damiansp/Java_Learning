// PanelFrameTest.java
import javax.swing.JFrame;

public class PanelFrameTest extends JFrame {
  public static void main(String[] args) {
    PanelFrame pf = new PanelFrame();
    pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pf.setSize(450, 200);
    pf.setVisible(true);
  }
}
