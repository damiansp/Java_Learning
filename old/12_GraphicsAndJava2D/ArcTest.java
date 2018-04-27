/* ArcTest.java */
import javax.swing.JFrame;

public class ArcTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Arcs");
    Arcs arcs = new Arcs();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(arcs);
    frame.setSize(300, 210);
    frame.setVisible(true);
  }
}
