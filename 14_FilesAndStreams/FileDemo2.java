/* FileDemo2.java */
// Demo for JFileChooser and File classes
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileDemo2 extends JFrame {
  private JTextArea outputArea = new JTextArea();
  private JScrollPane scrollPane = new JScrollPane(outputArea);

  // Constr: Set up GUI
  public FileDemo2() {
    super("File Class Demo");

    add(scrollPane, BorderLayout.CENTER);
    setSize(400, 400);
    setVisible(true);
    analyzePath(); // create and anlayze File object
  }

  // get user-specified file
  private File getFile() {
    // display file dialogue for user to choose file
    JFileChooser fileChooser = new JFileChooser();

    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    int result = fileChooser.showOpenDialog(this);

    // Cancel button pushed
    if (result == JFileChooser.CANCEL_OPTION) {
      System.exit(1);
    }

    File fileName = fileChooser.getSelectedFile();

    // invalid selection
    if ((fileName == null) || (fileName.getName().equals(""))) {
      JOptionPane.showMessageDialog(this,
                                    "Invalid File Name",
                                    "Invalid File Name",
                                    JOptionPane.ERROR_MESSAGE);
      System.exit(1);
    }

    return fileName;
  }

  // Display selected file info
  public void analyzePath() {
    // Create File obj
    File name = getFile();

    if (name.exists()) {
      // output dir info
      outputArea.setText(String.format(
        "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
        name.getName(), " exists",
        (name.isFile() ? "is a file" : "is not a file"),
        (name.isDirectory() ? "is a directory" : "is not a directory"),
        (name.isAbsolute() ? "is absolute path" : "is not absolute path"),
        "Last modified", name.lastModified(),
        "Length", name.length(),
        "Path: ", name.getPath(),
        "Absolute Path: ", name.getAbsolutePath(),
        "Parent: ", name.getParent()));

      if (name.isDirectory()) {
        // output dir listing
        String[] directory = name.list();
        outputArea.append("\n\nDirectory contents:\n");

        for (String directoryName : directory) {
          outputArea.append(directoryName + "\n");
        }
      }
    } else {
      // not file or dir: output error msg
      JOptionPane.showMessageDialog(
        this, name + "does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
  }
}
