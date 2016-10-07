/* BoxLayoutFrame.java */
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BoxLayoutFrame extends JFrame {
  // Constr-- GUI setup
  public BoxLayoutFrame() {
    super("BoxLayout Demo");

    Box h1 = Box.createHorizontalBox();
    Box h2 = Box.createHorizontalBox();
    Box v1 = Box.createVerticalBox();
    Box v2 = Box.createVerticalBox();
    final int SIZE = 3; // no. buttons per box
    
    
    for (int i = 0; i < SIZE; i++) {
      // Add buttons to h1
      h1.add(new JButton("Button " + i));
      
      // Create strut and add buttons to v1
      v1.add(Box.createVerticalStrut(25));
      v1.add(new JButton("Button " + i));
      
      // Create horizontal glue and add buttons to h2
      h2.add(Box.createHorizontalGlue());
      h2.add(new JButton("Button " + i));
      
      // Create rigid area and add buttons to v2
      v2.add(Box.createRigidArea(new Dimension(12, 8)));
      v2.add(new JButton("Button " + i));
    }
    
    // Create vert glue a dnadd buttons to panel
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
    for (int i = 0; i < SIZE; i++) {
      panel.add(Box.createGlue());
      panel.add(new JButton("Button " + i));
    }
    
    // Create JTabbedPane
    JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP,
                                       JTabbedPane.SCROLL_TAB_LAYOUT);
    
    // Place each container on tabbed pane
    tabs.addTab("Horizontal Box", h1);
    tabs.addTab("Vertical Box with Struts", v1);
    tabs.addTab("Horizontal Box with Glue", h2);
    tabs.addTab("Vertical Box with Rigid Areas", v2);
    tabs.addTab("Vertical Box with Glue", panel);
    add(tabs);
  }
}
