// ButtonFrame.java
// Creating JButtons for GUIs
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
  private JButton plainJButton;  // text only
  private JButton fancyJButton;  // icon

  // Constructor
  public ButtonFrame() {
    super("Testing Buttons");
    setLayout(new FlowLayout());
    plainJButton = new JButton("Plain Button");
    add(plainJButton);

    Icon me = new ImageIcon(getClass().getResource("me.jpg"));
    Icon meBW = new ImageIcon(getClass().getResource("me_bw.png"));
    fancyJButton = new JButton("Fancy Button", me);
    fancyJButton.setRolloverIcon(meBW);
    add(fancyJButton);

    // Button handler
    ButtonHandler handler = new ButtonHandler();
    fancyJButton.addActionListener(handler);
    plainJButton.addActionListener(handler);
  }

  // Inner class for button even handling
  private class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(
        ButtonFrame.this, String.format("Pushed: %s", e.getActionCommand()));
    }
  }
}
