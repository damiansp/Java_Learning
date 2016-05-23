// Draw some repetitive patters using JPanel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelDesign1 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int w = getWidth();
    int h = getHeight();
    int linesPerCorner = 100;

    // Draw lines from each corner to evenly spaced points along the diags
    for (int l = 0; l < linesPerCorner; l++) {
      // From upper left or bottom right corners:
      g.drawLine(0,
                 0,
                 l * w / linesPerCorner,
                 (linesPerCorner - l) * h / linesPerCorner);
                 
      g.drawLine(w,
                 h,
                 l * w / linesPerCorner,
                 (linesPerCorner - l) * h / linesPerCorner);

      // From ur or bl
      g.drawLine(w,
                 0,
                 l * w / linesPerCorner,
                 l * h / linesPerCorner);

      g.drawLine(0,
                 h,
                 l * w / linesPerCorner,
                 l * h / linesPerCorner);
      
    }
    
  }
}
