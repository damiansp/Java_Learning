/* FontPanelTest.java */
import javax.swing.JFrame;

public class FontPanelTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Using Fonts");
    FontPanel fontPanel = new FontPanel();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(fontPanel);
    frame.setSize(420, 170);
    frame.setVisible(true);
  }
}
