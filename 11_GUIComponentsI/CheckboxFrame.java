// CheckboxFrame.java
// Create JCheckBox buttons
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckboxFrame extends JFrame {
  private JTextField tf; // text in changing fonts
  private JCheckBox boldCB; // toggle bold
  private JCheckBox italicCB; // toggle italics

  // Constructor -- adds checkboxes to JFrame
  public CheckboxFrame() {
    super("JCheckBox Test");
    setLayout(new FlowLayout());

    // Text field
    tf = new JTextField("Check out that font shift", 20);
    tf.setFont(new Font("Serif", Font.PLAIN, 14));
    add(tf);

    // Checkboxes
    boldCB = new JCheckBox("Bold");
    italicCB = new JCheckBox("Italic");
    add(boldCB);
    add(italicCB);

    // Register listeners for checkboxes
    CheckBoxHandler handler = new CheckBoxHandler();
    boldCB.addItemListener(handler);
    italicCB.addItemListener(handler);
  }

  // Inner class for ItemListener event handling
  private class CheckBoxHandler implements ItemListener {
    private int valBold = Font.PLAIN; // initial values
    private int valItalic = Font.PLAIN;

    // Respond to checkboxes
    public void itemStateChanged(ItemEvent e) {
      // Bold
      if (e.getSource() == boldCB) {
        valBold = boldCB.isSelected() ? Font.BOLD : Font.PLAIN;
      }

      // Italic
      if (e.getSource() == italicCB) {
        valItalic = italicCB.isSelected() ? Font.ITALIC : Font.PLAIN;
      }

      // Font
      tf.setFont(new Font("Serif", valBold + valItalic, 14));
    }
  }
}
