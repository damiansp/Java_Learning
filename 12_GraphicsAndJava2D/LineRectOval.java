/* LineRectOval.java */
// Basic drawing
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LineRectOval extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    g.setColor(Color.RED);
    g.drawLine(5, 30, 380, 30); // (x1, y1, x2, y2)
    g.setColor(Color.BLUE);
    g.drawRect(5, 40, 90, 55); // (x, y, w, h)
    g.fillRect(100, 40, 90, 55); // (x, y, wh, h)
    g.setColor(Color.CYAN);
    g.drawRoundRect(195, 40, 90, 55, 50, 50); // (x, y, w, h, arcw, arch)
    g.fillRoundRect(290, 40, 90, 55, 50 , 20);
    g.setColor(Color.YELLOW);
    g.draw3DRect(5, 100, 90, 55, true); // x, y, w, h, b: t: raised; f: lowered
    g.fill3DRect(100, 100, 90, 55, false);
    g.setColor(Color.MAGENTA);
    g.drawOval(195, 100, 90, 55);
    g.fillOval(290, 100, 90, 55);
  }
}
