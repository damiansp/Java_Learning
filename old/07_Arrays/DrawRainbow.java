/* Demo for using colors in an array */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {
  // Define some colors
  final Color VIOLET = new Color(128, 0, 128);
  final Color INDIGO = new Color(75, 0, 130);

  // Rainbow colors in order
  private Color[] colors = { Color.WHITE,
                             Color.WHITE,
                             VIOLET,
                             INDIGO,
                             Color.BLUE,
                             Color.GREEN,
                             Color.YELLOW,
                             Color.ORANGE,
                             Color.RED };
  // Constructor
  public DrawRainbow() {
    setBackground(Color.WHITE);
  }

  // Draw a rainbow
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int r = 20, // radius of arc
      centerX = getWidth() / 2,
      centerY = getHeight() - 10;

    // draw filled arcs, starting with outermost
    for (int c = colors.length; c > 0; c--) {
      g.setColor(colors[c - 1]);

      g.fillArc(
        centerX - c * r, centerY - c * r, c * r * 2, c * r * 2, 0, 180);
    }
    
  }
}
