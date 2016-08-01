/* ShowColorsJFrame.java */
// Using color chooser
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowColorsJFrame extends JFrame {
  private JButton changeColorButton = new JButton("Change Color");
  private Color color = Color.LIGHT_GRAY;
  private JPanel colorPanel = new JPanel();

  // Set up GUI
  public ShowColorsJFrame() {
    super("Using JColorChooser");

    colorPanel.setBackground(color);

    // set up changeColorButton and register its event handler
    changeColorButton.addActionListener(new ActionListener() {
        // Display JColorChooser on click
        public void actionPerformed(ActionEvent e) {
          color = JColorChooser.showDialog(
            ShowColorsJFrame.this, "Choose a color", color);

          // Set default color if none returned
          if (color == null) {
            color = Color.LIGHT_GRAY;
          }

          // Change pane bg color
          colorPanel.setBackground(color);
        }
    });

    add(colorPanel, BorderLayout.CENTER);
    add(changeColorButton, BorderLayout.SOUTH);
    setSize(400, 130);
    setVisible(true);
  }
}
