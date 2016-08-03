/* LineRectOvalTest.java */
import java.awt.Color;
import javax.swing.JFrame;

public class LineRectOvalTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Lines, Rectangles, and Ovals Demo");
    LineRectOval lro = new LineRectOval();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(lro);
    frame.setSize(400, 210);
    frame.setVisible(true);    
  }
}
