// LabelFrame.java
// Demonstrate the JLabel class
import java.awt.FlowLayout;   // component arrangement
import javax.swing.Icon;      // use/manipulate images
import javax.swing.ImageIcon; // load images
import javax.swing.JFrame;    // basic window features
import javax.swing.JLabel;    // display text, images
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
  private JLabel label1; // text only
  private JLabel label2; // constructed with text and icon
  private JLabel label3; // add text and icon

  // Constructor: adds JLabels to JFrame
  public LabelFrame() {
    super("Testing JLabel");
    setLayout(new FlowLayout());

    // JLabel constructor with String arg
    label1 = new JLabel("Label with text only");
    label1.setToolTipText("This is label1");
    add(label1);

    // JLabel constructor with String, Icon, and alignment args
    Icon me = new ImageIcon(getClass().getResource("me.jpg"));
    label2 = new JLabel("Label with text and icon", me, SwingConstants.LEFT);
    label2.setToolTipText("This is label2");
    add(label2);

    label3 = new JLabel(); // no-arg construction
    label3.setText("Label with icon and text at bottom");
    label3.setIcon(me);
    label3.setHorizontalTextPosition(SwingConstants.CENTER);
    label3.setVerticalTextPosition(SwingConstants.BOTTOM);
    label3.setToolTipText("This is label3");
    add(label3);
  }
}
