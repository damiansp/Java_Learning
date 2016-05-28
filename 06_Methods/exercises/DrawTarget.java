/* Demonstrate shape drawing */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class DrawTarget extends JPanel {
  private int colorChoice;

  public DrawTarget(int colChoice) {
    colorChoice = colChoice;
  }
  
  public Color randColor(int inColor) {
    Random rand = new Random();
    int r, g, b;
    
    r = rand.nextInt(256);
    
    if (inColor == 0) {
      g = b = r;
    } else {
      g = rand.nextInt(256);
      b = rand.nextInt(256);
    }

    Color color = new Color(r, g, b);
    
    return color;
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Color col1, col2;
    int maxDiameter = 800,
      offset = 20,
      alt = 0;
    
    col1 = randColor(colorChoice);
    col2 = randColor(colorChoice);
    
    // Make 5 concentric circles each inside the previous and with alt colors
    
    for (int d = 0; d <= (maxDiameter / 2) - offset; d += offset) {
      // Alt colors
      if (alt == 0) {
        g.setColor(col1);
      } else {
        g.setColor(col2);
      }

      alt = 1 - alt;
      
      // Draw next circle
      g.fillOval(d, d, maxDiameter - 2*d, maxDiameter - 2*d);
    }
  }
}
