/* ShapesTest.java */
import javax.swing.JFrame;

public class ShapesTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Using the Java 2D API");
    Shapes shapes = new Shapes();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(shapes);
    frame.setSize(425, 200);
    frame.setVisible(true);
  }
}
