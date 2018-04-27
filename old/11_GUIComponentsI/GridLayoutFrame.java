/* GridLayoutFrame.java */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame implements ActionListener {
  private final String[] names = { "I", "II", "III", "IV", "V", "VI" };
  private JButton[] buttons = new JButton[names.length];
  private boolean toggle = true;
  private Container container = getContentPane();
  private GridLayout gl1;
  private GridLayout gl2;

  // Constr
  public GridLayoutFrame() {
    super("GridLayout Demo");
    gl1 = new GridLayout(2, 3, 5, 5); // 2x3 grid with gaps 5x5
    gl2 = new GridLayout(3, 2); // 3x2 no gaps

    setLayout(gl1);

    for (int i = 0; i < names.length; i++) {
      buttons[i] = new JButton(names[i]);
      buttons[i].addActionListener(this);
      add(buttons[i]);
    }
  }

  // Event handler
  public void actionPerformed(ActionEvent e) {
    if (toggle) {
      container.setLayout(gl2);
    } else {
      container.setLayout(gl1);
    }

    toggle = !toggle;
    container.validate(); // re-lay out  container
  }
}
