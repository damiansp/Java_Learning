/* PanelFrame.java */
// Using JPanel to help lay out components
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {
  private JPanel buttonPanel = new JPanel();
  private JButton[] buttons = new JButton[5];

  // Constr
  public PanelFrame() {
    super("Panel Demo");
    buttonPanel.setLayout(new GridLayout(1, buttons.length));

    // Create and add buttons
    for (int i = 0; i < buttons.length; i++) {
      buttons[i] = new JButton("Button " + (i + 1));
      buttonPanel.add(buttons[i]);
    }

    add(buttonPanel, BorderLayout.SOUTH);
  }
}
