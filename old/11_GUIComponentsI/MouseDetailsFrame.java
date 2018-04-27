/* MouseDetailsFrame.java */
// Demo mouse clicks and mouse buttons
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame {
  private String details;
  private JLabel statusBar;

  // Constr -- sets title bar String, registers mouse listener
  public MouseDetailsFrame() {
    super("Mouse clix and buttonz");

    statusBar = new JLabel("Clickez-vous le mouse");
    add(statusBar, BorderLayout.SOUTH);
    addMouseListener(new MouseClickHandler());
  }

  // Mouse event handler
  private class MouseClickHandler extends MouseAdapter {
    // Which button clicked
    public void mouseClicked(MouseEvent e) {
      int xPos = e.getX();
      int yPos = e.getY();

      details = String.format("Clicked %d time(s)", e.getClickCount());

      // right click
      if (e.isMetaDown()) {
        details += " with right mouse button";
      } else if (e.isAltDown()) {
        details += " with center mouse button";
      } else {
        details += " with left mouse button";
      }

      statusBar.setText(details);
    }
  }
}
