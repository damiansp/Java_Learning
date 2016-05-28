// Test DrawTarget
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrawTargetTest {
  public static void main(String[] args) {
    // Get color or b & w
    String input = JOptionPane.showInputDialog(
      "Enter color choice:\n0: black & white\n1: color");

    int choice = Integer.parseInt(input);

    // Create panel
    DrawTarget panel = new DrawTarget(choice);

    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(panel);
    app.setSize(800, 800);
    app.setVisible(true);
  }
}
