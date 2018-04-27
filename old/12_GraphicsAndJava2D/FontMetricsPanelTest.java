/* FontMetricsPanelTest.java */
import javax.swing.JFrame;

public class FontMetricsPanelTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("FontMetrics Demo");
    FontMetricsPanel fmp = new FontMetricsPanel();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(fmp);
    frame.setSize(525, 250);
    frame.setVisible(true);
  }
}
