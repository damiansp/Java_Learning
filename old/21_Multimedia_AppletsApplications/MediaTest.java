/* MediaTest.java */
// Simple media player
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MediaTest {
  public static void main(String[] args) {
    JFileChooser fChooser = new JFileChooser();
    int result = fChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
      // Choose a file
      URL url = null;

      try {
        // get file as url
        url = fChooser.getSelectedFile().toURL();
      } catch (MalformedURLException murle) {
        System.err.println("Could not create URL for the file");
      }

      if (url != null) {
        JFrame mediaTest = new JFrame("Media Tester");
        MediaPanel mediaPanel = new MediaPanel(url);
        
        mediaTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mediaTest.add(mediaPanel);
        mediaTest.setSize(300, 300);
        mediaTest.setVisible(true);
      }
    }
  }
}
