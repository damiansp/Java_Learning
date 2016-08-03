/* PolygonTest.java */
import javax.swing.JFrame;

public class PolygonTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Polygons");
    Polygons poly = new Polygons();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(poly);
    frame.setSize(280, 270);
    frame.setVisible(true);
  }
}
