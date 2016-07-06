// ListFrame.Java
// Select colors from a JList
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {
  private JList colorJList; // list to display colors
  private final String colorNames[] = {
    "Black", "Dark Grey", "Grey", "Light Grey", "White", "Pink", "Red",
    "Orange", "Yellow", "Green", "Blue", "Cyan", "Magenta" };
  private final Color colors[] = {
    Color.BLACK, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.WHITE,
    Color.PINK, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
    Color.CYAN, Color.MAGENTA };

  // Constr -- add JScrollPane containing JList to JFrame
  public ListFrame() {
    super("List Test");
    setLayout(new FlowLayout());

    colorJList = new JList(colorNames);
    colorJList.setVisibleRowCount(5);

    // Do not allow mult selections
    colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Add a JScrollPane containing JList to frame
    add(new JScrollPane(colorJList));

    colorJList.addListSelectionListener(new ListSelectionListener() {
        // Anonymous inner class -- handle list value selections
        public void valueChanged(ListSelectionEvent e) {
          // Set background color to selected color 
          getContentPane().setBackground(
            colors[colorJList.getSelectedIndex()]);
        }
    });
  }
}
  
  
  
  
