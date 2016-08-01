/* FontPanel.java */
// Using fonts
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontPanel extends JPanel {
  // Display strings in various fonts and colors
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Set font to Serif (= Times), bold, 12 pt and draw a String
    g.setFont(new Font("Serif", Font.BOLD, 12));
    g.drawString("Serif 12 pt, bold", 20, 50);

    // Monospace (= Courier), italic, 24 pt
    g.setFont(new Font("Monospaced", Font.ITALIC, 24));
    g.drawString("Monospaced 24 pt, italic", 20, 70);

    // Sans (= Helvetica) plain 17 pt
    g.setColor(Color.RED);
    g.setFont(new Font("SansSerif", Font.PLAIN, 17));
    g.drawString("Sans Serif 17 pt, plain", 20, 90);

    g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));
    g.drawString(g.getFont().getName() + " " + g.getFont().getSize() +
                 "point bold italic",
                 20,
                 110);
  }
}
