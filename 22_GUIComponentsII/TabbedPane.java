/* TabbedPane.java */
// JTabedPane demo
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class TabbedPane extends JFrame {
  // Constr-- GUI setup
  public TabbedPane() {
    super("JTabbedPane Demo");

    JTabbedPane tabs = new JTabbedPane();
    JLabel label1 = new JLabel("Panel one", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    JLabel label2 = new JLabel("Panel two", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    JLabel label3 = new JLabel("Panel three");
    JPanel panel3 = new JPanel();

    panel1.add(label1);
    tabs.addTab("Tab One", null, panel1, "First Panel");
    panel2.setBackground(Color.YELLOW);
    panel2.add(label2);
    tabs.addTab("Tab Two", null, panel2, "Second Panel");
    panel3.setLayout(new BorderLayout());
    panel3.add(new JButton("North"), BorderLayout.NORTH);
    panel3.add(new JButton("South"), BorderLayout.SOUTH);
    panel3.add(new JButton("East"), BorderLayout.EAST);
    panel3.add(new JButton("West"), BorderLayout.WEST);
    panel3.add(label3, BorderLayout.CENTER);
    tabs.addTab("Tab Three", null, panel3, "Third Panel");
    add(tabs);
  }
}
