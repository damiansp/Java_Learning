/* ReadServerFiAle.java */
// Use JEditor to display a file's contents in the browser
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadServerFile extends JFrame {
  private JTextField enterField;
  private JEditorPane contentsArea;

  // load doc
  private void getPage(String location) {
    try {
      // load doc, display location
      contentsArea.setPage(location);
      enterField.setText(location);
    } catch(IOException ioEx) {
      JOptionPane.showMessageDialog(this,
                                    "Error retrieving specifed URL",
                                    "Bad URL",
                                    JOptionPane.ERROR_MESSAGE);
    }
  }
  
  // Set up GUI
  public ReadServerFile() {
    super("Simple Web Browser");

    // create enterField and register its listeners
    enterField = new JTextField("Enter file URL here");
    enterField.addActionListener(new ActionListener() {
        // get doc specified by user
        public void actionPerformed(ActionEvent e) {
          getPage(e.getActionCommand());
        }
    });

    add(enterField, BorderLayout.NORTH);
    contentsArea = new JEditorPane();
    contentsArea.setEditable(false);
    contentsArea.addHyperlinkListener(new HyperlinkListener() {
        // if user clicked hyperlink go to specified page
        public void hyperlinkUpdate(HyperlinkEvent e) {
          if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            getPage(e.getURL().toString());
          }
        }
    });

    add(new JScrollPane(contentsArea), BorderLayout.CENTER);
    setSize(400, 300);
    setVisible(true);
  }
}
