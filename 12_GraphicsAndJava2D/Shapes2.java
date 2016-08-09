/* Shapes2.java */
// Demonstrating a general path
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class Shapes2 extends JPanel {
  public void paintComponent(Graphics g) {
    Random rand = new Random();
    int xv[] = { 55, 67, 109, 73, 83, 55, 27, 37,  1, 43 };
    int yv[] = {  0, 36,  36, 54, 96, 72, 96, 54, 36, 36 };
    Graphics2D g2d = (Graphics2D) g;
    GeneralPath star = new GeneralPath();
    
    super.paintComponent(g);
    // Set init coordinate of GeneralPath
    star.moveTo(xv[0], yv[0]);

    // Create star (doesn't draw)
    for (int i = 1; i < xv.length; i ++) {
      star.lineTo(xv[i], yv[i]);
    }

    star.closePath();
    g2d.translate(200, 200); // translates origin to (200, 200)

    // rotate around origin, drawing stars of rand colors
    for (int i = 1; i <= 100; i++) {
      g2d.rotate(Math.PI / 50.0);

      // rand color
      g2d.setColor(new Color(
        rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
      g2d.fill(star);
    }
  }
}
