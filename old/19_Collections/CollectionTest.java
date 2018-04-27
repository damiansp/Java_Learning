/* CollectionTest.java */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
  private static final String[] colors = {
    "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
  private static final String[] rmColors = { "RED", "WHITE", "BLUE" };

  // Constr-- reate ArrayList, add colors and manipulate
  public CollectionTest() {
    List<String> list = new ArrayList<String>();
    List<String> rmList = new ArrayList<String>();

    // Add elements in colors to list
    for (String color: colors) {
      list.add(color);
    }

    // Add elems in rmColors to rmList
    for (String color: rmColors) {
      rmList.add(color);
    }

    System.out.println("ArrayList: ");

    // Output list contents
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("%s ", list.get(i));
    }

    // Remove colors contained in rmList
    removeColors(list, rmList);
    System.out.println("\n\nArrayList after calling removeColors():");

    // Output list contents
    for (String color: list) {
      System.out.printf("%s ", color);
    }

    System.out.println();
  }

  // Remove colors specified in collection2 from collection1
  private void removeColors(Collection<String> c1, Collection<String> c2) {
    // Get iterator
    Iterator<String> iterator = c1.iterator();

    // While collection has items
    while (iterator.hasNext()) {
      if (c2.contains(iterator.next())) {
        iterator.remove();
      }
    }
  }



  public static void main(String[] args) {
    new CollectionTest();
  }
}
