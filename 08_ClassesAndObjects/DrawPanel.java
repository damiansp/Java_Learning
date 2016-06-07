/* DrawPanel.java */
// Uses Lines class to draw random lines
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
  private Random rand = new Random();
  private Lines[] lines;
  private final int N_LINES = 100;

  // Constructor -- create a panel with rand lines
  public DrawPanel() {
    setBackground(Color.BLACK);
    lines = new Lines[N_LINES];

    // create lines
    for (int i = 0; i < lines.length; i++) {
      // generate rand coords
      int x1 = rand.nextInt(300);
      int y1 = rand.nextInt(300);
      int x2 = rand.nextInt(300);
      int y2 = rand.nextInt(300);

      // rand color
      Color color = new Color(
        rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

      // add line to lines array
      lines[i] = new Lines(x1, y1, x2, y2, color);
    }
  }

  // for each line in array, draw
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // draw lines
    for (Lines line: lines) {
      line.draw(g);
    }
  }
}
