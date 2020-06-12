package timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;


public class TimerTest {
  public static void main(String[] args) {
    var listener = new TimePrinter();
    // construct a timer that calls the listener once a second
    var timer = new Timer(1000, listener);

    timer.start();
    // Keep prog running until user selects "OK"
    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }
}


class TimePrinter implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("At the tone, the time is "
                       + Instant.ofEpochMilli(e.getWhen()));
    Toolkit.getDefaultToolkit().beep();
  }
}
