package innerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

/** Inner Class Demo */
public class InnerClassTest {
  public static void main(String[] args) {
    var clock = new TalkingClock(1000, true);
    clock.start();
    JOptionPane.showMessageDialog(null, "Quit Program?");
    System.exit(0);
  }
}


/** A clock that prints the time in regular intervals */
class TalkingClock {
  private int interval;
  private boolean beep;

  /**
   * Constructs a talking clock
   * @param interval the interval (in ms) between messages
   * @param beep true if clock should beep
   */
  public TalkingClock(int interval, boolean beep) {
    this.interval = interval;
    this.beep = beep;
  }

  /**
   * Starts the clock
   */
  public void start() {
    var listener = new TimePrinter();
    var timer = new Timer(interval, listener);
    timer.start();
  }

  public class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.out.println("At the tone, the time is"
                         + Instant.ofEpochMilli(e.getWhen()));
      if (beep) Toolkit.getDefaultToolkit().beep();
    }
  }
}
