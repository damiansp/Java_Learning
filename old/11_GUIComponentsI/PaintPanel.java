/* PaintPanel.java */
// Using class MouseMotionAdapter
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
  private int pointCount = 0;
  private Point[] points = new Point[1000];

  // Constr -- Set up GUI with mouse event handler
  public PaintPanel() {
    // mouse motion event
    addMouseMotionListener(new MouseMotionAdapter() {
        // store drag coords and repaint
        public void mouseDragged(MouseEvent e) {
          if (pointCount < points.length) {
            points[pointCount] = e.getPoint();
            pointCount++;
            repaint();
          }
        }
    });
  }

  // Draw oval in 4x4 bounding box at specified location on window
  public void paintComponent(Graphics g) {
    super.paintComponent(g); // clears drawing area

    // draw all points in array
    for (int i = 0; i < pointCount; i++) {
      g.fillOval(points[i].x, points[i].y, 4, 4);
    }
  }
}
