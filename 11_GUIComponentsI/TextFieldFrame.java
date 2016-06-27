// TextFieldFrame.java
// Demo of JTextField class
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
  private JTextField tf1; // text field with set size
  private JTextField tf2; // ...with constructed text
  private JTextField tf3; // ...with text and size
  private JPasswordField passwordField;

  // Constructor: adds JTextFields to JFrame
  public TextFieldFrame() {
    super("Testing JTextField and JPasswordField");
    setLayout(new FlowLayout());

    // Construct 10-col text field
    tf1 = new JTextField(10);
    add(tf1);

    // Construct text fiewld with default text
    tf2 = new JTextField("Enter text here");
    add(tf2);

    // Construct text field with text and 21 cols
    tf3 = new JTextField("Undeditable text field", 21);
    tf3.setEditable(false);
    add(tf3);

    // Construct password field with default text
    passwordField = new JPasswordField("Hidden text");
    add(passwordField);

    // Register event handlers
    TextFieldHandler handler = new TextFieldHandler();
    tf1.addActionListener(handler);
    tf2.addActionListener(handler);
    tf3.addActionListener(handler);
    passwordField.addActionListener(handler);
  }

  // private inner class for event handling
  private class TextFieldHandler implements ActionListener {
    // process text field events
    public void actionPerformed(ActionEvent e) {
      String string = "";

      // user pressed <Enter> in JTextField x
      if (e.getSource() == tf1) {
        string = String.format("tf1: %s", e.getActionCommand());
      } else if (e.getSource() == tf2) {
        string = String.format("tf2: %s", e.getActionCommand());
      } else if (e.getSource() == tf3) {
        string = String.format("tf3: %s", e.getActionCommand());
      } else if (e.getSource() == passwordField) {
        string = String.format("passwordField: %s",
                               new String(passwordField.getPassword()));
      }

      // display JTextField content
      JOptionPane.showMessageDialog(null, string);
    }
  }
}
