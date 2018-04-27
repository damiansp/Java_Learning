/* AdditionApplet.java */
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AdditionApplet extends JApplet {
  private double sum = 0;

  // init applet by obtaining vals from user
  public void init() {
    String num1 = JOptionPane.showInputDialog("Enter a number"),
      num2 = JOptionPane.showInputDialog("And a second, please");
    double n1 = Double.parseDouble(num1),
      n2 = Double.parseDouble(num2);

    sum = n1 + n2;
  }

  // draw results in a box on applet's bkg
  public void paint(Graphics g) {
    super.paint(g);
    g.drawRect(15, 10, 270, 20);

    // Draw results as String at (25, 25)
    g.drawString("The sum is " + sum, 25, 25);
  }
}
