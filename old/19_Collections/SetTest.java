/* SetTest.java */
// Demo of HashSet: does not store duplicates
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
  private static final String[] colors = { "red", "white", "blue", "green",
                                           "grey", "orange", "tan", "white",
                                           "cyan", "peach", "grey", "orange" };

  // Create Set from Array to remove duplicates, and print
  private void printNonDuplicates(Collection<String> coll) {
    // Create HashSet
    Set<String> set = new HashSet<String>(coll);

    System.out.println("\nNon-duplicates are:");
    for (String s: set) {
      System.out.printf("%s ", s);
    }

    System.out.println();
  }

  // Constr-- create and output ArrayList
  public SetTest() {
    List<String> list = Arrays.asList(colors);
    System.out.printf("ArrayList: %s\n", list);
    printNonDuplicates(list);
  }

  public static void main(String[] args) {
    new SetTest();
  }
}
