/* PopupFrame.java */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class PopupFrame extends JFrame {
  private final JRadioButtonMenuItem[] items;
  private final Color[] colorValues = { Color.BLUE, Color.YELLOW, Color.RED };
  private final JPopupMenu popupMenu;

  // Constr-- init GUI
  public PopupFrame() {
    super("Using JPopupMenus");

    ItemHandler handler = new ItemHandler(); // class defined below
    String[] colors = { "Blue", "Yellow", "Red" };
    ButtonGroup colorGroup = new ButtonGroup();

    popupMenu = new JPopupMenu();
    items = new JRadioButtonMenuItem[colors.length];

    // Constr muenu item, add to pop-up menu, enable event handling
    for (int i = 0; i < items.length; i++) {
      items[i] = new JRadioButtonMenuItem(colors[i]);
      popupMenu.add(items[i]);
      colorGroup.add(items[i]);
      items[i].addActionListener(handler);
    }

    setBackground(Color.BLACK);

    // Declare MouseListener for the window to display popup menu
    addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          checkForTriggerEvent(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          checkForTriggerEvent(e);
        }

        // Determine if event should trigger pop-up menu
        private void checkForTriggerEvent(MouseEvent e) {
          if (e.isPopupTrigger()) {
            popupMenu.show(e.getComponent(), e.getX(), e.getY());
          }
        }
    });
  }

  private class ItemHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      // Determine item selected
      for (int i = 0; i < items.length; i++) {
        if (e.getSource() == items[i]) {
          getContentPane().setBackground(colorValues[i]);
          return;
        }
      }
    }
  }
}
