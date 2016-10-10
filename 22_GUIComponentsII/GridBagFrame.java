/* GridBagFrame.java */
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridBagFrame extends JFrame {
  private final GridBagLayout layout = new GridBagLayout();
  private final GridBagConstraints constraints = new GridBagConstraints();

  // Constr-- GUI setup
  public GridBagFrame() {
    super("GridBagLayout");
    setLayout(layout);

    // GUI Components
    JTextArea textArea1 = new JTextArea("TextArea1", 5, 10);
    JTextArea textArea2 = new JTextArea("TextArea2", 2, 2);
    String[] names = { "Iron", "Steel", "Brass" };
    JComboBox<String> comboBox = new JComboBox<String>(names);
    JTextField textField = new JTextField("TextField");
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 2");

    constraints.fill = GridBagConstraints.BOTH;
    addComponent(textArea1, 0, 0, 1, 3);
    constraints.fill = GridBagConstraints.HORIZONTAL;
    addComponent(button1, 0, 1, 2, 1);
    addComponent(comboBox, 2, 1, 2, 1);
    constraints.weightx = 1000; // can grow wider
    constraints.weighty = 1;    // can grow taller
    constraints.fill = GridBagConstraints.BOTH;
    addComponent(button2, 1, 1, 1, 1);
    constraints.weightx = 0;
    constraints.weighty = 0;
    addComponent(button3, 1, 2, 1, 1);
    addComponent(textField, 3, 0, 2, 1);
    addComponent(textArea2, 3, 2, 1, 1);
  }

  private void addComponent(
    Component component, int row, int col, int w, int h) {
    constraints.gridx = col;
    constraints.gridy = row;
    constraints.gridwidth = w;
    constraints.gridheight = h;
    layout.setConstraints(component, constraints);
    add(component);
  }
}
