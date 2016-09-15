/* WelcomeApplet.java */
import java.awt.Graphics;
import javax.swing.JApplet;

public class WelcomeApplet extends JApplet {
  // draw text on applet bkg
  public void paint(Graphics g) {
    super.paint(g);

    // draw String at coords (25, 25)
    g.drawString("Welcome to Java Applets", 25, 25);
  }
}
