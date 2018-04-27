/* Demonstrate shape drawing */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Da face
    g.setColor(Color.YELLOW);
    g.fillOval(10, 10, 200, 200);

    // Da eyes
    g.setColor(Color.BLACK);
    g.fillOval(55, 65, 35, 35);
    g.fillOval(135, 65, 25, 25);

    // Da mouf
    g.fillOval(50, 110, 120, 60);
    // Touch up
    g.setColor(Color.YELLOW);
    g.fillRect(50, 110, 120, 30);
    g.fillOval(50, 120, 120, 40);
  }
}
