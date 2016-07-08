/* KeyFrame.java */
// Demo keystroke events
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyFrame extends JFrame implements KeyListener {
  private String line1 = ""; // First line of text area...
  private String line2 = ""; // ...
  private String line3 = "";
  private JTextArea textArea = new JTextArea(10, 15);

  // Constr
  public KeyFrame() {
    super("Demonstrating Keystroke Events");

    textArea.setText("Press any key on the keyboard...");
    textArea.setEnabled(false); // disable textArea
    textArea.setDisabledTextColor(Color.GRAY);
    add(textArea);
    addKeyListener(this);
  }

  private void setLines2and3(KeyEvent e) {
    line2 = String.format(
      "This key is %san action key", e.isActionKey() ? "" : "not ");

    String temp = e.getKeyModifiersText(e.getModifiers());

    line3 = String.format(
      "Modifier keys pressed: %s", (temp.equals("") ? "none" : temp));

    textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3));
  }
  
  // Handle key press events
  public void keyPressed(KeyEvent e) {
    // output released key
    line1 = String.format("Key pressed: %s", e.getKeyText(e.getKeyCode()));
    setLines2and3(e);
  }

  // Handle key release events
  public void keyReleased(KeyEvent e) {
    line1 = String.format("Key released: %s", e.getKeyText(e.getKeyCode()));
    setLines2and3(e);
  }

  // Handle press of action key
  public void keyTyped(KeyEvent e) {
    line1 = String.format("Key typed: %s", e.getKeyChar());
    setLines2and3(e);
  }
}
