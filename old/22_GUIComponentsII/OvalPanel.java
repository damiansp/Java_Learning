/* OvalPanel.java */
// Custom panel
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {
  private int diameter = 10;

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.YELLOW);
    g.fillOval(10, 10, diameter, diameter);
  }

  public void setDiameter(int newDiameter) {
    diameter = (newDiameter >= 0 ? newDiameter : 10);
    repaint();
  }

  public Dimension getPreferredSize() {
    return new Dimension(200, 200);
  }

  public Dimension getMinSize() {
    return getPreferredSize();
  }
}
