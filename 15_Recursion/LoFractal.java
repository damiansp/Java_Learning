/* LoFractal.java */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoFractal extends JFrame {
  private final int WIDTH = 800;
  private final int HEIGHT = 960;
  private final int MIN_LEVEL = 0;
  private Color color = Color.CYAN;
  private JButton changeColorButton = new JButton("Color"),
    increaseLevelButton = new JButton("Increase Level"),
    decreaseLevelButton = new JButton("Decrease Level");;
  private JLabel levelLabel = new JLabel("Level: 0");
  private LoFractalPanel drawSpace = new LoFractalPanel(0);
  private JPanel mainPanel = new JPanel(),
    controlPanel = new JPanel();

  // Set up GUI
  public LoFractal() {
    super("Lo Fractal");

    // Set up control panel
    controlPanel.setLayout(new FlowLayout());

    // Set up color button and register listener
    controlPanel.add(changeColorButton);
    changeColorButton.addActionListener(new ActionListener() {
        // process changeColor event
        public void actionPerformed(ActionEvent e) {        
          color = JColorChooser.showDialog(
            LoFractal.this, "Choose color", color);
          
          // Set default color
          if (color == null) { color = Color.CYAN; }

          drawSpace.setColor(color);
        }
    });

    // Add decrease level button to control panel, and reg. listener
    controlPanel.add(decreaseLevelButton);
    decreaseLevelButton.addActionListener(new ActionListener() {
        // process decreasLevel event
        public void actionPerformed(ActionEvent e) {
          int level = drawSpace.getLevel();
          level--;

          // modify level if poss.
          if (level >= MIN_LEVEL) {
            levelLabel.setText("Level: " + level);
            drawSpace.setLevel(level);
            repaint();
          }
        }
    });

    // Add increase level button to control panel, and reg listener
    controlPanel.add(increaseLevelButton);
    increaseLevelButton.addActionListener(new ActionListener() {
        // process increaseLevel event
        public void actionPerformed(ActionEvent e) {
          int level = drawSpace.getLevel();
          level++;

          // modify level if poss.
          if (level >= MIN_LEVEL) {
            levelLabel.setText("Level: " + level);
            drawSpace.setLevel(level);
            repaint();
          }
        }
    });

    // Add levelLabel to controlPanel
    controlPanel.add(levelLabel);

    // Add controlPanel and drawSpace to mainPanel
    mainPanel.add(controlPanel);
    mainPanel.add(drawSpace);
    add(mainPanel);
    setSize(WIDTH, HEIGHT);
    setVisible(true);
  }

  public static void main(String[] args) {
    LoFractal demo = new LoFractal();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

