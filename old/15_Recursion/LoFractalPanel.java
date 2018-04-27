/* LoFractalPanel.java */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class LoFractalPanel extends JPanel {
  private Color color;
  private int level; // level of recursion
  private final int WIDTH = 800,
    HEIGHT = 800;

  // Set the init fractal level to the vlue specified and set up JPanel specs
  public LoFractalPanel(int currentLevel) {
    color = Color.CYAN;
    level = currentLevel;
    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
  }

  // Draw fractal recursively
  public void drawFractal(
    int level, int xA, int yA, int xB, int yB, Graphics g) {
    // Base case -- draw a line connecting two given pts
    if (level == 0) {
      g.drawLine(xA, yA, xB, yB);
    } else {
      // Recursion -- determine new points, draw next level
      // Calculate midpoint of (xA, yA) and (xB, yB)
      int xMid = (xA + xB) / 2,
        yMid = (yA + yB) / 2;

      // Calc the 4th pt (xD, yD) that forms an isoc triangel between (xA, yA)
      // and (xMid, yMid), where the right angle is (xD, yD)
      int xD = xA + (xMid - xA) / 2 - (yMid - yA) / 2,
        yD   = yA + (yMid - yA) / 2 + (xMid - xA) / 2;

      // Recursively draw fractal
      drawFractal(level - 1, xD, yD, xA,   yA,   g);
      drawFractal(level - 1, xD, yD, xMid, yMid, g);
      drawFractal(level - 1, xD, yD, xB,   yB,   g);
    }
  }

  // Start drawing the fractal
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw fractal pattern
    g.setColor(color);
    drawFractal(level,
                200, 180, 580, 400,
                g);
  }

  // Acc
  public void setColor(Color c) { color = c; }
  public void setLevel(int currentLevel) { level = currentLevel; }
  public int getLevel() { return level; }
}
