import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetTest {
  public static void main(String[] args) {
    String[] colors = {
      "red", "orange", "yellow", "green", "blue", "purple", "brown", "black",
      "grey", "white", "pink", "red", "blue"};
    List<String> list = Arrays.asList(colors);

    System.out.printf("List: %s\n", list);
    printUnique(list);
  }


  private static void printUnique(Collection<String> values) {
    // Create HashSet
    Set<String> set = new HashSet<>(values);

    System.out.printf("\nUnique values:\n");
    for (String value: set) System.out.printf(" %s\n", value);
  }
}
