/* Arcs.java */
// Drawing arcs
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Arcs extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.BLACK);
    
    g.setColor(Color.CYAN);
    g.drawRect(15, 35, 80, 80);
    g.setColor(Color.WHITE);
    // Start at 0, sweep out 360 deg arc
    g.drawArc(15, 35, 80, 80, 0, 360); // (x1, y1, w, h, start, angle)

    g.setColor(Color.CYAN);
    g.drawRect(100, 35, 80, 80);
    g.setColor(Color.WHITE);
    // 0 - 110 deg
    g.drawArc(100, 35, 80, 80, 0, 110);

    g.setColor(Color.CYAN);
    g.drawRect(185, 35, 80, 80);
    g.setColor(Color.WHITE);
    // 0 - -270
    g.drawArc(185, 35, 80, 80, 0, -270);

    g.setColor(Color.CYAN);
    // 0 - 360
    g.fillArc(15, 120, 80, 40, 0, 360);

    g.setColor(Color.MAGENTA);
    // 270 -90
    g.fillArc(100, 120, 80, 40, 270, -90);

    g.setColor(Color.YELLOW);
    // 0 -270
    g.fillArc(185, 120, 80, 40, 0, -270);
  }
}
