/* Shapes2Test.java */
import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2Test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("General Path Demo");
    Shapes2 stars = new Shapes2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(stars);
    frame.setBackground(Color.WHITE);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }
}
