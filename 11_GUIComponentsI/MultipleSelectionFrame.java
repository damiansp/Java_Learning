// MultipleSelectionFrame.java
// Copying items from one List to another
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
  private JList colorJList;  // hold color names
  private JList copyJList;   // list to copy color names into
  private JButton copyJButton;
  private final String colorNames[] = {
    "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };

  // Constr
  public MultipleSelectionFrame() {
    super("Multiple Selection Lists");
    setLayout(new FlowLayout());

    colorJList = new JList(colorNames);
    colorJList.setVisibleRowCount(5);
    colorJList.setSelectionMode(
      ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(colorJList));

    copyJButton = new JButton("Copy >>>");
    copyJButton.addActionListener(new ActionListener() {
        // Handle button event
        public void actionPerformed(ActionEvent e) {
          // Copy selected values to copyList
          copyJList.setListData(colorJList.getSelectedValues());
        }
    });

    add(copyJButton);

    copyJList = new JList();
    copyJList.setVisibleRowCount(5);
    copyJList.setFixedCellWidth(100);
    copyJList.setFixedCellHeight(15);
    copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    add(new JScrollPane(copyJList));
  }
}
