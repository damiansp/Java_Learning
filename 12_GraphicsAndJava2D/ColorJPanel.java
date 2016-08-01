/* ColorJPanel.java */
// Color Demo
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel {
  // Draw Rects and Strings in diff colors
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);

    // Set new drawing color using ints
    g.setColor(new Color(255, 0, 0));
    g.fillRect(15, 25, 100, 20);
    g.drawString("Current RGB: " + g.getColor(), 130, 40);

    // Set color using floats
    g.setColor(new Color(0.50f, 0.75f, 0.0f));
    g.fillRect(15, 50, 100, 20);
    g.drawString("Current RGB: " + g.getColor(), 130, 65);

    // Set color using static Color obj
    g.setColor(Color.BLUE);
    g.fillRect(15, 75, 100, 20);
    g.drawString("Current RGB: " + g.getColor(), 130, 90);

    // Display individ RGB vals
    Color color = Color.MAGENTA;
    g.setColor(color);
    g.fillRect(15, 100, 100, 20);
    g.drawString(
      "RGB values: " + color.getRed() + ", " + color.getGreen() + ", " +
      color.getBlue(),
      130,
      115);
  }
}
