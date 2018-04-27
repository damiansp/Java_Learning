/* MouseTrackerFrame.java */
// Demo for mouse events
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame {
  private JPanel mousePanel; // panel in which mouse events will occur
  private JLabel statusBar;  // display event info

  // Contr -- set up GUI, register mouse event handlers
  public MouseTrackerFrame() {
    super("Demonstrating Mouse Events");

    mousePanel = new JPanel();
    mousePanel.setBackground(Color.CYAN);
    add(mousePanel, BorderLayout.CENTER);

    statusBar = new JLabel("Moutse outside JPanel");
    add(statusBar, BorderLayout.SOUTH);

    // Create and register listener for mouse & mouse-motion events
    MouseHandler handler = new MouseHandler();
    mousePanel.addMouseListener(handler);
    mousePanel.addMouseMotionListener(handler);
  }

  private class MouseHandler implements MouseListener, MouseMotionListener {
    // MouseListener event handlers
    public void mouseClicked(MouseEvent e) {
      statusBar.setText(String.format(
        "Clicked at (%d, %d)", e.getX(), e.getY()));
    }

    public void mousePressed(MouseEvent e) {
      statusBar.setText(String.format(
        "Pressed at (%d, %d)", e.getX(), e.getY()));
    }

    public void mouseReleased(MouseEvent e) {
      statusBar.setText(String.format(
        "Released at (%d, %d)", e.getX(), e.getY()));
    }

    public void mouseEntered(MouseEvent e) {
      statusBar.setText(String.format(
        "Mouse entered at (%d, %d)", e.getX(), e.getY()));
      mousePanel.setBackground(Color.MAGENTA);
    }

    public void mouseExited(MouseEvent e) {
      statusBar.setText(String.format("Mouse exited JPanel"));
      mousePanel.setBackground(Color.CYAN);
    }

    public void mouseDragged(MouseEvent e) {
      statusBar.setText(String.format(
        "Dragged from (%d, %d)", e.getX(), e.getY()));
      mousePanel.setBackground(Color.YELLOW);
    }

    public void mouseMoved(MouseEvent e) {
      statusBar.setText(String.format(
        "Moved from (%d, %d)", e.getX(), e.getY()));
    }
  }
}
