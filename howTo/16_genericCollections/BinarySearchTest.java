import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class BinarySearchTest {
  public static void main(String[] args) {
    String[] colors = {"red", "orange", "yellow", "green", "blue", "purple",
                       "brown", "black"};
    List<String> list = new ArrayList<>(Arrays.asList(colors));

    Collections.sort(list);
    System.out.printf("Sorted: %s\n", list);
    printSearchResults(list, "black");
    printSearchResults(list, "red");
    printSearchResults(list, "blue");
    printSearchResults(list, "aqua"); // below lowest
    printSearchResults(list, "grey"); // does not exist
    printSearchResults(list, "zirconium"); // above highest
  }

  private static void printSearchResults(List<String> list, String key) {
    System.out.printf("\nSearching for: %s\n", key);
    int result = Collections.binarySearch(list, key);

    if (result >= 0) System.out.printf("Found at index: %d\n", result);
    else System.out.printf("Not found (%d)\n", result);
  }
}
