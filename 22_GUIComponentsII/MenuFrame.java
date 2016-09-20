/* MenuFrame.java */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

public class MenuFrame extends JFrame {
  private final Color[] colorValues = {
    Color.BLACK, Color.BLUE, Color.RED, Color.GREEN };
  private JRadioButtonMenuItem[] colorItems;
  private JRadioButtonMenuItem[] fonts;
  private JCheckBoxMenuItem[] styleItems;
  private JLabel displayLabel = new JLabel("Sample Text",
                                           SwingConstants.CENTER);
  private ButtonGroup fontBtns = new ButtonGroup(),
    colorBtns = new ButtonGroup();
  private int style;

  // Const-- set up GUI
  public MenuFrame() {
    super("Using JMenus");
    JMenu fileMenu = new JMenu("File");
    fileMenu.setMnemonic('F');

    JMenuItem aboutItem = new JMenuItem("About...");
    aboutItem.setMnemonic('A');
    fileMenu.add(aboutItem);
    aboutItem.addActionListener(new ActionListener() {
        // Display msg dialogue
        public void actionPerformed(ActionEvent e) {
          JOptionPane.showMessageDialog(MenuFrame.this,
                                        "This is an example\nof menu use",
                                        "About",
                                        JOptionPane.PLAIN_MESSAGE);
          
        }
    });

    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.setMnemonic('x');
    fileMenu.add(exitItem);
    exitItem.addActionListener( new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
        }
    });

    JMenuBar bar = new JMenuBar();
    setJMenuBar(bar);
    bar.add(fileMenu);

    JMenu formatMenu = new JMenu("Format");
    formatMenu.setMnemonic('r');

    String[] colors = { "Black", "Blue", "Red", "Green" };
    JMenu colorMenu = new JMenu("Color");
    colorMenu.setMnemonic('C');

    // Color radio buttons
    colorItems = new JRadioButtonMenuItem[colors.length];
    ItemHandler itemHandler = new ItemHandler();

    for (int i = 0; i < colors.length; i++) {
      colorItems[i] = new JRadioButtonMenuItem(colors[i]);
      colorMenu.add(colorItems[i]);
      colorBtns.add(colorItems[i]);
      colorItems[i].addActionListener(itemHandler);
    }

    colorItems[0].setSelected(true);
    formatMenu.add(colorMenu);
    formatMenu.addSeparator();

    // Font names
    String[] fontNames = { "Serif", "Monospaced", "SansSerif" };
    JMenu fontMenu = new JMenu("Font");
    fontMenu.setMnemonic('n');

    // Font radio buttons
    fonts = new JRadioButtonMenuItem[fontNames.length];

    for (int i = 0; i < fonts.length; i++) {
      fonts[i] = new JRadioButtonMenuItem(fontNames[i]);
      fontMenu.add(fonts[i]);
      fontBtns.add(fonts[i]);
      fonts[i].addActionListener(itemHandler);
    }

    fonts[0].setSelected(true);
    fontMenu.addSeparator();

    String[] styleNames = { "Bold", "Italic" };
    styleItems = new JCheckBoxMenuItem[styleNames.length];
    StyleHandler styleHandler = new StyleHandler();

    // Style check boxes
    for (int i = 0; i < styleNames.length; i++) {
      styleItems[i] = new JCheckBoxMenuItem(styleNames[i]);
      fontMenu.add(styleItems[i]);
      styleItems[i].addItemListener(styleHandler);
    }

    formatMenu.add(fontMenu);
    bar.add(formatMenu);

    // Display text on label
    displayLabel.setForeground(colorValues[0]);
    displayLabel.setFont(new Font("Serif", Font.PLAIN, 72));
    getContentPane().setBackground(Color.CYAN);
    add(displayLabel, BorderLayout.CENTER);
  }  // end constr

  // Event handler class
  private class ItemHandler implements ActionListener {
    // Color and font selections
    public void actionPerformed(ActionEvent e) {
      // color
      for (int i = 0; i < colorItems.length; i++) {
        if (colorItems[i].isSelected()) {
          displayLabel.setForeground(colorValues[i]);
          break;
        }
      }

      // font
      for (int i = 0; i < fonts.length; i++) {
        if (e.getSource() == fonts[i]) {
          displayLabel.setFont(new Font(fonts[i].getText(), style, 72));
        }
      }

      repaint();
    }
  }

  // Handle for style from check boxes
  private class StyleHandler implements ItemListener {
    // font style
    public void itemStateChanged(ItemEvent e) {
      style = 0;

      // bold
      if (styleItems[0].isSelected()) {
        style += Font.BOLD;
      }

      // italic
      if (styleItems[1].isSelected()) {
        style += Font.ITALIC;
      }

      displayLabel.setFont(
        new Font(displayLabel.getFont().getName(), style, 72));
      repaint();
    }    
  }
}
