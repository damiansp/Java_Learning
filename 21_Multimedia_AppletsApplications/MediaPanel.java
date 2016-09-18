/* MediaPanel.java */
// JPanel that plays media from a URL
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JPanel;

public class MediaPanel extends JPanel {
  public MediaPanel(URL mediaURL) {
    setLayout(new BorderLayout());

    // Use lightweight components for Swing compatibility
    Manager.setHint(Manager.LIGTHWEIGHT_RENDERER, true);

    try {
      // Create player to play the media in URL
      Player mediaPlayer = Manager.createRealizedPlayer(mediaURL);

      // Get components for the video and playback controls
      Component video = mediaPlayer.getVisualComponent(),
        controls = mediaPlayer.getControPanelComponent();

      if (video != null) {
        add(video, BorderLayout.CENTER);
      }

      if (controls != null) {
        add(controls, BorderLayout.SOUTH);
      }

      mediaPlayer.start();
    } catch (NoPlayerException npe) {
      System.err.println("No media player found.");
    } catch (CannotRealizeException cre) {
      System.err.println("Could not realize media player.");
    } catch (IOException ioe) {
      System.err.println("Error reading from source.");
    }
  }
}
