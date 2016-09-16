/* LoadScaleImage.java */
// Load an image, display in original size and 2x, as well as as icon
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class LoadScaleImage extends JApplet {
  private Image img1;
  private ImageIcon img2;

  // Load image when applet is loaded
  public void init() {
    img1 = getImage(getDocumentBase(), "me.png");
    img2 = new ImageIcon("me_bw.png");
  }

  // Display image
  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(img1, 0, 0, this);
    g.drawImage(img1, 0, 120, getWidth(), getHeight() - 120, this);
    img2.paintIcon(this, g, 180, 0);
  }
}
