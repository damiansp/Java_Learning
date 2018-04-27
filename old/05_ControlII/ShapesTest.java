// Test Shapes class
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
  public static void main(String[] args) {
    // get shape choice
    String input = JOptionPane.showInputDialog("Enter:\n1 for rectangles\n" +
                                               "2 for ovals");
    int choice = Integer.parseInt(input);

    // Create panel
    Shapes panel  = new Shapes(choice);

    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(panel);
    app.setSize(400, 400);
    app.setVisible(true);
  }
}
