/* LoadPlayAudio.java */
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class LoadPlayAudio extends JApplet {
  private AudioClip sound1, sound2, currentSound;
  private JButton playBtn = new JButton("Play"),
    loopBtn = new JButton("Loop"),
    stopBtn = new JButton("Stop");
  private JComboBox soundCBox;

  // load the image when the applet begins executing
  public void init() {
    String[] choices = { "Welcome", "Hi" };

    setLayout(new FlowLayout());
    soundCBox = new JComboBox(choices);
    soundCBox.addItemListener(new ItemListener() {
        // stop sound and change to user's selection
        public void itemStateChanged(ItemEvent e) {
          currentSound.stop();
          currentSound = soundCBox.getSelectedIndex() == 0 ? sound1 : sound2;
        }
    });

    add(soundCBox);

    // buttons and button event handlers
    ButtonHandler handler = new ButtonHandler();

    // Play button
    playBtn.addActionListener(handler);
    add(playBtn);

    // Loop
    loopBtn.addActionListener(handler);
    add(loopBtn);

    // Stop
    stopBtn.addActionListener(handler);
    add(stopBtn);

    // Load & set current sound
    sound1 = getAudioClip(getDocumentBase(), "welcome.wav");
    sound2 = getAudioClip(getDocumentBase(), "hi.wav");
    currentSound = sound1;
  }

  // Stop on page change
  public void stop() {
    currentSound.stop();
  }

  // ButtonHandler class
  private class ButtonHandler implements ActionListener {
    // process play, loop, stop events
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == playBtn) {
        currentSound.play();
      } else if (e.getSource() == loopBtn) {
        currentSound.loop();
      } else if (e.getSource() == stopBtn) {
        currentSound.stop();
      }
    }
  }
}
