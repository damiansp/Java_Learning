/* VectorTest.java */
import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorTest {
  private static final String[] colors = { "red", "yellow", "blue" };

  // Constr
  public VectorTest() {
    Vector<String> v = new Vector<String>();

    printVector(v);

    // Add elems
    for (String c: colors) {
      v.add(c);
    }
    printVector(v);

    // Output first and last elems
    try {
      System.out.printf("First element: %s\n", v.firstElement());
      System.out.printf("Last element: %s\n",  v.lastElement());
    } catch (NoSuchElementException nseEx) {
      nseEx.printStackTrace();
    }

    // Does v contain "red"?
    if (v.contains("red")) {
      System.out.printf("\n\"red\" found at index %d\n\n", v.indexOf("red"));
    } else {
      System.out.println("\n\"red\" not found\n");
    }

    v.remove("red");
    System.out.println("\"red\" has been removed.");
    printVector(v);

    // Does v contain "red" now?
    if (v.contains("red")) {
      System.out.printf("\n\"red\" found at index %d\n\n", v.indexOf("red"));
    } else {
      System.out.println("\n\"red\" not found\n");
    }

    // Print size and capacity of v
    System.out.printf("\nSize: %d\nCapacity: %d\n", v.size(), v.capacity());
  }

  // print
  private void printVector(Vector<String> v) {
    if (v.isEmpty()) {
      System.out.print("vector is empty");
    } else {
      System.out.print("vector contains: ");

      for (String elem: v) {
        System.out.printf("%s ", elem);
      }
    }

    System.out.println("\n");
  }


  public static void main(String[] args) {
    new VectorTest();
  }
}
