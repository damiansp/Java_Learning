/* Shapes.java */
// Various 2D Shapes demo
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Shapes extends JPanel {
  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    
    super.paintComponent(g);

    // Ellipse w blue-yellow grad
    // GradientPaint(startX, startY, startColor, endX, endY, endColor)
    g2d.setPaint(new GradientPaint(
      5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
    g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

    // Rect red
    g2d.setPaint(Color.RED);
    g2d.setStroke(new BasicStroke(10.0f)); // set stroke width
    g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

    // Rounded Rect  w buffered bg
    BufferedImage buffImage = new BufferedImage(
      10, 10, BufferedImage.TYPE_INT_RGB); // w, h, colorType
    // Obtain Graphics2D from buffImage and draw on it
    Graphics2D gg = buffImage.createGraphics();
    gg. setColor(Color.CYAN);
    gg.fillRect(0, 0, 10, 10);
    gg.setColor(Color.BLACK);
    gg.drawRect(1, 1, 6, 6);
    gg.setColor(Color.BLUE);
    gg.fillRect(1, 1, 3, 3);
    gg.setColor(Color.MAGENTA);
    gg.fillRect(4, 4, 3, 3);

    // Paint buffImage onto frame
    g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
    g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 30));

    // Draw pie-shaped arc - white
    g2d.setPaint(Color.WHITE);
    g2d.setStroke(new BasicStroke(6.0f));
    g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

    // Draw lines - green & red
    g2d.setPaint(Color.GREEN);
    g2d.draw(new Line2D.Double(395, 30, 320, 150));

    float dashes[] = { 10 };
    g2d.setPaint(Color.RED);
    g2d.setStroke(new BasicStroke(
      4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
    g2d.draw(new Line2D.Double(320, 30, 395, 150));
  }
}
