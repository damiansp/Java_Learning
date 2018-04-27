// Demo use of GUI labels
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {
  public static void main(String[] args) {
    // Create label with plain text
    JLabel northLabel = new JLabel("North");

    // Create an icon from an image to put on label
    ImageIcon labelIcon = new ImageIcon("me.jpg", "my head");

    // Create labels with icon instead of text
    JLabel centerLabel = new JLabel(labelIcon);
    JLabel southLabel = new JLabel(labelIcon);

    // Set label to display text (in addition to icon)
    southLabel.setText("South");

    // Frame
    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add labels to frame: (label, location)
    app.add(northLabel, BorderLayout.NORTH);
    app.add(centerLabel, BorderLayout.CENTER);
    app.add(southLabel, BorderLayout.SOUTH);

    app.setSize(600, 600);
    app.setVisible(true);
  }
}
