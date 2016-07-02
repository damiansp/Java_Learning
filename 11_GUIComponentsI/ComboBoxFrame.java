// ComboBoxFrame.java
// Using a JComboBox (drop-down) to select an image
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
  private JComboBox imagesCombo;
  private JLabel label;

  private String[] images = { "me.jpg", "me_bw.png" };
  private Icon[] icons = { new ImageIcon(getClass().getResource(images[0])),
                           new ImageIcon(getClass().getResource(images[1])) };

  // Constructor -- Adds JComboBox to JFrame
  public ComboBoxFrame() {
    super("Testing the JComboBox");
    setLayout(new FlowLayout());

    imagesCombo = new JComboBox(images);
    imagesCombo.setMaximumRowCount(3);

    imagesCombo.addItemListener(new ItemListener() {
        // Anonymous inner class
        // Event handler
        public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setIcon(icons[imagesCombo.getSelectedIndex()]);
          }
        }
    });

    add(imagesCombo);
    label = new JLabel(icons[0]);
    add(label);
  }
}
