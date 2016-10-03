/* SliderFrame.java */
// GUI slider demo
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {
  private JSlider diamSlider = new JSlider(
    SwingConstants.HORIZONTAL, 0, 200, 10);
  private OvalPanel panel = new OvalPanel();

  // Constr
  public SliderFrame() {
    super("Slider Demo");
    panel.setBackground(Color.BLACK);

    // Set up slider
    diamSlider.setMajorTickSpacing(10); // create a tick at every 10
    diamSlider.setPaintTicks(true);

    // Register listener
    diamSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
          panel.setDiameter(diamSlider.getValue());
        }
    });

    add(diamSlider, BorderLayout.SOUTH);
    add(panel, BorderLayout.CENTER);
  }
}
