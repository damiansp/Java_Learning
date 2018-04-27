/* DesktopFrame.java */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class DesktopFrame extends JFrame {
  private final JDesktopPane theDesktop = new JDesktopPane();

  // Constr-- GUI setup
  public DesktopFrame() {
    super("Using a JDesktopPane");

    JMenuBar bar = new JMenuBar();
    JMenu addMenu = new JMenu("Add");
    JMenuItem newFrame = new JMenuItem("Internal Frame");

    addMenu.add(newFrame);
    bar.add(addMenu);
    setJMenuBar(bar);
    add(theDesktop);

    // Listener for newFrame menu item
    newFrame.addActionListener(new ActionListener() {
        // Display new internal window
        @Override
        public void actionPerformed(ActionEvent e) {
          JInternalFrame frame = new JInternalFrame(
            "Internal Frame", true, true, true, true);

          MyJPanel panel = new MyJPanel();
          frame.add(panel, BorderLayout.CENTER);
          frame.pack(); // set internal frame to size of contents
          theDesktop.add(frame);
          frame.setVisible(true);
        }
    });
  }
}



class MyJPanel extends JPanel {
  private static final SecureRandom rand = new SecureRandom();
  private final ImageIcon pic;
  private final static String[] images = { "me.jpg", "me_bw.png" };

  // load image
  public MyJPanel() {
    int randN = rand.nextInt(images.length);
    pic = new ImageIcon(images[randN]);
  }

  // Display imageIcon on panel
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    pic.paintIcon(this, g, 0, 0);
  }

  // Return image dims
  public Dimension getPreferredSize() {
    return new Dimension(pic.getIconWidth(), pic.getIconHeight());
  }
}
