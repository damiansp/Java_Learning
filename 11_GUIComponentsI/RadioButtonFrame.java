// RadioButtonFrame.java
// Using ButtonGroup and JRadioButton to make radio buttons
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
  private JTextField tf;
  private Font plainFont;
  private Font boldFont;
  private Font italicFont;
  private Font boldItalicFont;
  private JRadioButton plainRadio;
  private JRadioButton boldRadio;
  private JRadioButton italicRadio;
  private JRadioButton boldItalicRadio;
  private ButtonGroup radioGroup;

  // Constructor -- ads JRadioButtons to JFrame
  public RadioButtonFrame() {
    super("Radio Button Test");
    setLayout(new FlowLayout());

    tf = new JTextField("Check out these style changes!", 25);
    add(tf);

    // Create radio buttons
    plainRadio = new JRadioButton("Plain", true); // selected at start
    boldRadio = new JRadioButton("Bold", false);
    italicRadio = new JRadioButton("Italic", false);
    boldItalicRadio = new JRadioButton("Bold Italic", false);
    add(plainRadio);
    add(boldRadio);
    add(italicRadio);
    add(boldItalicRadio);

    // Group radio buttons
    radioGroup = new ButtonGroup();
    radioGroup.add(plainRadio);
    radioGroup.add(boldRadio);
    radioGroup.add(italicRadio);
    radioGroup.add(boldItalicRadio);

    // Create Font objects
    plainFont = new Font("Serif", Font.PLAIN, 14);
    boldFont = new Font("Serif", Font.BOLD, 14);
    italicFont = new Font("Serif", Font.ITALIC, 14);
    boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    tf.setFont(plainFont);

    // Register events for radio buttons
    plainRadio.addItemListener(new RadioButtonHandler(plainFont));
    boldRadio.addItemListener(new RadioButtonHandler(boldFont));
    italicRadio.addItemListener(new RadioButtonHandler(italicFont));
    boldItalicRadio.addItemListener(new RadioButtonHandler(boldItalicFont));
  }

  // Inner class to handle radio button events
  private class RadioButtonHandler implements ItemListener {
    private Font font;

    // Constructor
    public RadioButtonHandler(Font f) {
      font = f;
    }

    // Event handler
    public void itemStateChanged(ItemEvent e) {
      tf.setFont(font);
    }
  }
}

