// Test DrawPanelDesign
import javax.swing.JFrame;

public class DrawPanelDesignsTest {
  public static void main(String[] args) {
    // Create panel
    DrawPanelDesign1 panel1 = new DrawPanelDesign1();

    // Create frame
    JFrame app = new JFrame();

    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(panel1);
    app.setSize(250, 250);
    app.setVisible(true);
  }
}
