package anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;


/** Anonymous inner class demo */
public class AnonymousInnerClassTest {
  public static void main(String[] args) {
    var clock = new TalkingClock();

    clock.start(1000, true);
    JOptionPane.showMessageDialog(null, "Quit Program?");
    System.exit(0);
  }
}


/** A clock that prints time at regular intevals */
class TalkingClock {
  /**
   * Start the clock
   * @param interval the interval between msgs (ms)
   * @param beep true if the clock should beep
   */
  public void start(int interval, boolean beep) {
    var listener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone the time is: "
                           + Instant.ofEpochMilli(e.getWhen()));
        if (beep) Toolkit.getDefaultToolkit().beep();
      }
    };
    var timer = new Timer(interval, listener);
    timer.start();
  }
}
