/* GridBagFrame2.java */
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class GridBagFrame2 extends JFrame {
  private final GridBagLayout layout = new GridBagLayout();
  private final GridBagConstraints constraints = new GridBagConstraints();

  // Constr-- GUI setup
  public GridBagFrame2() {
    super("GrizidBizagLizayout");
    setLayout(layout);

    // Components
    String[] metals = { "Copper", "Aluminum", "Silver", "Heavy" };
    String[] fonts = { "Serif", "Monospaced" };
    String[] names = { "Nol", "Isa", "Dua", "Tiga", "Empat" };
    JComboBox comboBox = new JComboBox(metals);
    JList list = new JList(fonts);
    JButton[] buttons = new JButton[names.length];
    JTextField textField = new JTextField("Le TexteFielde");

    for (int i = 0; i < buttons.length; i++) {
      buttons[i] = new JButton(names[i]);
    }

    // Constraints
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent(textField);

    constraints.gridwidth = 1;
    addComponent(buttons[0]);

    constraints.gridwidth = GridBagConstraints.RELATIVE;
    addComponent(buttons[1]);

    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent(buttons[2]);

    constraints.weighty = 0;
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent(comboBox);

    constraints.weighty = 1;
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent(buttons[3]);

    constraints.gridwidth = GridBagConstraints.RELATIVE;
    addComponent(buttons[4]);

    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent(list);
  }

  // Add a component to the container
  private void addComponent(Component c) {
    layout.setConstraints(c, constraints);
    add(c);
  }
}
