/* SiteSelector.java */
// Loads a doc from a URL
import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SiteSelector extends JApplet {
  private HashMap<Object, URL> sites; // site names and urls
  private ArrayList<String> siteNames;
  private JList siteChooser; // list of sites to choose from

  // obtain parameters from HTML doc
  private void getSitesFromHTMLParameters() {
    String title;
    String location;
    URL url;
    int i = 0; // count no. of sites

    title = getParameter("title" + i);

    // loop over all params in doc
    while (title != null) {
      // get site location
      location = getParameter("location" + i);

      try {
        // place title/URL in HashMap and title in ArrayList
        url = new URL(location);
        sites.put(title, url); // put title, url in HashMap
        siteNames.add(title);  // ... and title in ArrayList
      } catch (MalformedURLException mURLExc) {
        mURLExc.printStackTrace();
      }

      i++;
      title = getParameter("title" + i);
    }
  }

  // read HTML params and set up GUI
  public void init() {
    sites = new HashMap<Object, URL>(); // create HashMap
    siteNames = new ArrayList<String>(); // create ArrayList

    // obtain params for HTML doc
    getSitesFromHTMLParameters();

    // create GUI components, layout interface
    add(new JLabel("Choose a site to browse."), BorderLayout.NORTH);

    siteChooser = new JList(siteNames.toArray()); // populate JList
    siteChooser.addListSelectionListener(new ListSelectionListener() {
        // go to user-selected site
        public void valueChanged(ListSelectionEvent e) {
          // get selected site name
          Object object = siteChooser.getSelectedValue();

          // use site name to locate corresponing url
          URL newDoc = sites.get(object);

          // get applet container
          AppletContext browser = getAppletContext();

          // tell applet container to change pages
          browser.showDocument(newDoc);
        }
    });
  }
}
