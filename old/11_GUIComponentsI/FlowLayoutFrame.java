/* FlowLayoutFrame.java */
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
  private JButton leftButton = new JButton("Left");
  private JButton centerButton = new JButton("Center");
  private JButton rightButton = new JButton("Right");
  private FlowLayout layout = new FlowLayout();
  private Container container = getContentPane();

  // Constr -- set up GUI, register button listeners
  public FlowLayoutFrame() {
    super("FlowLayout Demo");
    
    setLayout(layout);

    // Left button
    add(leftButton);
    leftButton.addActionListener(new ActionListener() {
        // Process button event
        public void actionPerformed(ActionEvent e) {
          layout.setAlignment(FlowLayout.LEFT);

          // Realign attached components
          layout.layoutContainer(container);
        }
    });

    // Center
    add(centerButton);
    centerButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          layout.setAlignment(FlowLayout.CENTER);
          layout.layoutContainer(container);
        }
    });

    // Right
    add(rightButton);
    rightButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          layout.setAlignment(FlowLayout.RIGHT);
          layout.layoutContainer(container);
        }
    });
  }
}
