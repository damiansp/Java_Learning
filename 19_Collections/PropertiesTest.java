/* PropertiesTest.java */
// Demo of Properties class
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
  private Properties table = new Properties();

  // print properties
  public void listProperties() {
    Set<Object> keys = table.keySet(); // get propertie names

    // output: name: value pairs
    for (Object key: keys) {
      System.out.printf("%s:\t%s\n", key, table.getProperty((String) key));
    }

    System.out.println();
  }

  // save properties to file
  public void saveProperties() {
    try {
      FileOutputStream output = new FileOutputStream("props.dat");
      table.store(output, "Sample Properties"); // save
      output.close();
      System.out.println("After saving properties:");
      listProperties();
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
  }

  // load properties from file
  public void loadProperties() {
    try {
      FileInputStream input = new FileInputStream("props.dat");
      table.load(input); // load
      input.close();
      System.out.println("After loading properties");
      listProperties();
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
  }
  
  // Constr-- Set up GUI to test Properties table
  public PropertiesTest() {
    table.setProperty("color", "blue");
    table.setProperty("width", "200");

    System.out.println("After setting properties:");
    listProperties();

    // Replace property value
    table.setProperty("color", "red");

    System.out.println("After replacing property:");
    listProperties();
    saveProperties();
    table.clear(); // empty table

    System.out.println("After clearing properties:");
    listProperties();
    loadProperties();

    // Get value of property "color"
    Object value = table.getProperty("color");

    // Check if value in table
    if (value != null) {
      System.out.printf("Property of color's value is %s\n", value);
    } else {
      System.out.println("Property color is not in table");
    }
  }



  // Main
  public static void main(String[] args) {
    new PropertiesTest();
  }
}
