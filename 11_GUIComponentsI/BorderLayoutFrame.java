/* BorderLayoutFrame.java */
// BorderLayout Demo
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame implements ActionListener {
  private final String[] names = {
    "Hide North", "Hide South", "Hide East", "Hide West", "Hide Center" };
  private JButton[] buttons = new JButton[names.length];
  private BorderLayout layout = new BorderLayout(5, 5);

  // Constr -- GUI with event handling
  public BorderLayoutFrame() {
    super("BorderLayout Demo");
    setLayout(layout);

    for (int count = 0; count < names.length; count++) {
      buttons[count] = new JButton(names[count]);
      buttons[count].addActionListener(this);
    }

    add(buttons[0], BorderLayout.NORTH);
    add(buttons[1], BorderLayout.SOUTH);
    add(buttons[2], BorderLayout.EAST);
    add(buttons[3], BorderLayout.WEST);
    add(buttons[4], BorderLayout.CENTER);
  }

  // Event handler
  public void actionPerformed(ActionEvent e) {
    for(JButton button : buttons) {
      if (e.getSource() == button) {
        button.setVisible(false);
      } else {
        button.setVisible(true);
      }
    }

    layout.layoutContainer(getContentPane());
  }
}
