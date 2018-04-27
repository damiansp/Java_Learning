/* TextAreaFrame.jave */
// Copying selected text from one text area to another
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {
  private JTextArea ta1;
  private JTextArea ta2 = new JTextArea(10, 15);
  private JButton copyButton = new JButton("Copy >>");

  // Constr
  public TextAreaFrame() {
    super("TextArea Demo");
    Box box = Box.createHorizontalBox();
    String demo = "This is a demo string to\nillustrate copying text\nfrom" +
      " one text area to\nanother using an\nexternal event";
    ta1 = new JTextArea(demo, 10, 15);
    box.add(new JScrollPane(ta1));
    box.add(copyButton);

    copyButton.addActionListener(new ActionListener() {
        // Set text in ta2 to selected text from ta1
        public void actionPerformed(ActionEvent e) {
          ta2.setText(ta1.getSelectedText());
        }
    });

    ta2.setEditable(false);
    box.add(new JScrollPane(ta2));
    add(box);
  }
}
