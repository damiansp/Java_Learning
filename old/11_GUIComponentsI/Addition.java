// Addition.java
// Addition program that uses JOptionPanes for in/output
import javax.swing.JOptionPane;

public class Addition {
  public static void main(String[] args) {
    String n1 = JOptionPane.showInputDialog("Enter first integer:");
    String n2 = JOptionPane.showInputDialog("And the second (if you please):");

    // Convert input to ints
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    int sum =num1 + num2;

    // Output result
    JOptionPane.showMessageDialog(null, // locate at center screen
                                  "The sum is " + sum,
                                  "Sum of Tow Integers", // title
                                  JOptionPane.PLAIN_MESSAGE);
    
  }
}
