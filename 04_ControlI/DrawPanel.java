// Using drawLine to connect corners of a panel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
  // Draw x from corners
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int w = getWidth(),
      h = getHeight();

    // Draw lines
    g.drawLine(0, 0, w, h);
    g.drawLine(0, h, w, 0);
  }
}
