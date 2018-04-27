/* ColorJPanelTest.java */
import javax.swing.JFrame;

public class ColorJPanelTest {
  public static void main(String[] args) {
    // Create frame for ColorJPanel
    JFrame frame = new JFrame("Using Colors");
    ColorJPanel cjp = new ColorJPanel();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(cjp);
    frame.setSize(430, 180);
    frame.setVisible(true);
  }
}
