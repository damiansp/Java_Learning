// App to display a DrawPanel
import javax.swing.JFrame;

public class DrawPanelTest {
  public static void main(String[] args) {
    // Create panel w drawing
    DrawPanel panel = new DrawPanel();

    // Create new frame to hold panel
    JFrame app = new JFrame();

    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(panel);
    app.setSize(250, 250);
    app.setVisible(true);
  }
}
