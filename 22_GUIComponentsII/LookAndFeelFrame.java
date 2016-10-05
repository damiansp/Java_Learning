/* LookAndFeelFrame.java */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookAndFeelFrame extends JFrame {
  private final UIManager.LookAndFeelInfo[] looks;
  private final String[] lookNames;
  private final JRadioButton[] radio;
  private final ButtonGroup group;
  private final JButton button = new JButton("JButton");
  private final JLabel label;
  private final JComboBox<String> comboBox;

  // Constr-- GUI setup
  public LookAndFeelFrame() {
    super("Look and Feel Demo");

    // Get installed l-a-f info
    looks = UIManager.getInstalledLookAndFeels();
    lookNames = new String[looks.length];

    // get names of l-a-fs
    for (int i = 0; i < looks.length; i++) {
      lookNames[i] = looks[i].getName();
    }

    JPanel northPanel = new JPanel();

    northPanel.setLayout(new GridLayout(3, 1, 0, 5));
    label = new JLabel("This is a " + lookNames[0] + " look-and-feel",
                       SwingConstants.CENTER);
    northPanel.add(label);
    northPanel.add(button);
    comboBox = new JComboBox<String>(lookNames);
    northPanel.add(comboBox);

    // Array for radio buttons
    radio = new JRadioButton[looks.length];

    JPanel southPanel = new JPanel();
    // Use a GridLayout with 3 buttons in each row
    int rows = (int) Math.ceil(radio.length / 3.0);

    southPanel.setLayout(new GridLayout(rows, 3));
    group = new ButtonGroup();

    ItemHandler handler = new ItemHandler(); // class def below

    for (int i = 0; i < radio.length; i++) {
      radio[i] = new JRadioButton(lookNames[i]);
      radio[i].addItemListener(handler);
      group.add(radio[i]);
      southPanel.add(radio[i]);
    }

    add(northPanel, BorderLayout.NORTH);
    add(southPanel, BorderLayout.SOUTH);
    radio[0].setSelected(true);
  }


  // Use UIManager to change l-a-f
  private void changeLookAndFeel(int value) {
    try {
      // Set l-a-f for app
      UIManager.setLookAndFeel(looks[value].getClassName());
      // Update components in this app
      SwingUtilities.updateComponentTreeUI(this);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }


  private class ItemHandler implements ItemListener {
    // Process user's l-a-f selection
    @Override
    public void itemStateChanged(ItemEvent e) {
      for (int i = 0; i < radio.length; i++) {
        if (radio[i].isSelected()) {
          label.setText(String.format("This is a %s look-and-feel",
                                      lookNames[i]));
          comboBox.setSelectedIndex(i);
          changeLookAndFeel(i);
        }
      }
    }
  }
  
}
