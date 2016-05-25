// Test Shapes class
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConcentricCirclesTest {
  public static void main(String[] args) {
    // get shape choice
    String input = JOptionPane.showInputDialog("Size of largest radius");
    int maxRad = Integer.parseInt(input);

    // Create panel
    ConcentricCircles panel  = new ConcentricCircles(maxRad);

    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(panel);
    app.setSize(2 * maxRad, 2 * maxRad);
    app.setVisible(true);
  }
}
