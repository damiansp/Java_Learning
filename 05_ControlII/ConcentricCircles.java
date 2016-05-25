/* Drawing concentric circles */
import java.awt.Graphics;
import javax.swing.JPanel;

public class ConcentricCircles extends JPanel {
  private int maxRadius;

  // Constructor
  public ConcentricCircles(int maxR) {
    maxRadius = maxR;
  }
  
  // Draw a series of concentric circles
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int cornerOffset = 0;
    
    for (int r = maxRadius; r >= 10; r -= 10) {
      g.drawOval(cornerOffset, cornerOffset,
                 cornerOffset + 2 * r, cornerOffset + 2 * r);
      cornerOffset += 7;
    }
  }
}
