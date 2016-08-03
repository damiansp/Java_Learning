/* Polygons.java */
// Drawing polygons
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Polygons extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    int xv[] = { 20, 40, 50, 30, 20, 15 };
    int yv[] = { 50, 50, 60, 80, 80, 60 };
    int xv2[] = { 70, 90, 100, 80, 70, 65, 60 };
    int yv2[] = { 100, 100, 110, 110, 130, 110, 90 };
    int xv3[] = { 120, 140, 150, 190 };
    int yv3[] = { 40, 70, 80, 60 };
    Polygon poly1 = new Polygon(xv, yv, 6); // (xs, ys, nPoints)
    Polygon poly2 = new Polygon();

    // Draw polygon w Polygon obj
    g.drawPolygon(poly1);
    // Draw polyline w 2 arrays
    g.drawPolyline(xv2, yv2, 7);
    // Fill poly w 2 arrays
    g.fillPolygon(xv3, yv3, 4);
    // Fill poly with Poly object
    poly2.addPoint(165, 135);
    poly2.addPoint(175, 150);
    poly2.addPoint(270, 200);
    poly2.addPoint(200, 220);
    poly2.addPoint(130, 180);
    g.fillPolygon(poly2);
  }
}
