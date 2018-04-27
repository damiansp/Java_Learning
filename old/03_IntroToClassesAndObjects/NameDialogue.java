// Basic input for a dialogue box
import javax.swing.JOptionPane;

public class NameDialogue {
  public static void main(String[] args) {
    // Prompt user for name
    String name = JOptionPane.showInputDialog("What is your name?");

    // Create message
    String message = String.format("Welcome, %s, to Java Programming!", name);

    // Display msg
    JOptionPane.showMessageDialog(null, message);
  }
}
