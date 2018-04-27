/* ListTest.java */
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
  private static final String colors[] = { "black", "yellow", "green", "blue",
                                           "violet", "silver" };
  private static final String colors2[] = { "gold", "white", "brown", "blue",
                                            "grey", "silver" };

  // Constr-- Set up and manip LinkedLists
  public ListTest() {
    List<String> l1 = new LinkedList<String>();
    List<String> l2 = new LinkedList<String>();

    // Add to l1
    for (String color: colors) {
      l1.add(color);
    }

    // ...and to l2
    for (String color: colors2) {
      l2.add(color);
    }

    l1.addAll(l2); // concat lists
    l2 = null;     // release resources
    printList(l1);

    convertToUpperCase(l1);
    printList(l1);

    System.out.print("\nDeleting elements 4 - 6...");
    removeItems(l1, 4, 7);
    printList(l1);
    printReversedList(l1);
  }

  // Output List contents
  public void printList(List<String> list) {
    System.out.println("\nlist: ");

    for (String color: list) {
      System.out.printf("%s ", color);
    }

    System.out.println();
  }

  // Locate String objects and convert to upper case
  private void convertToUpperCase(List<String> list) {
    ListIterator<String> iterator = list.listIterator();

    while(iterator.hasNext()) {
      String color = iterator.next();
      iterator.set(color.toUpperCase());
    }
  }

  // Obtain sublist, use clear() to delete sublist items
  private void removeItems(List<String> list, int start, int end) {
    list.subList(start, end).clear();
  }

  // Print reversed list
  private void printReversedList(List<String> list) {
    ListIterator<String> iterator = list.listIterator(list.size());

    System.out.println("\nReversed List:");

    // Print in rev order
    while (iterator.hasPrevious()) {
      System.out.printf("%s ", iterator.previous());
    }

    System.out.println();
  }



  public static void main(String[] args) {
    new ListTest();
  }
}
