/* SortedSetTest.java */
// Use TreeSet and SortedSet
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
  private static final String[] names = { "yellow", "green", "black", "tan",
                                          "grey", "white", "orange", "red",
                                          "green" };

  // print
  private void printSet(SortedSet<String> set) {
    for (String s: set) {
      System.out.printf("%s ", s);
    }

    System.out.println();
  }
  
  // Constr-- create sorted set with TreeSet, then manip
  public SortedSetTest() {
    SortedSet<String> tree = new TreeSet<String>(Arrays.asList(names));

    System.out.println("sorted set:");
    printSet(tree);

    // get headSet based on "orange"
    System.out.print("\nheadSet(\"orange\"): ");
    printSet(tree.headSet("orange"));

    // tailSet based on "orange"
    System.out.print("tailSet(\"orange\"): ");
    printSet(tree.tailSet("orange"));

    // Get first and last elems
    System.out.printf("first: %s\n", tree.first());
    System.out.printf("last:  %s\n", tree.last());
  }


  public static void main(String[] args) {
    new SortedSetTest();
  }
}
