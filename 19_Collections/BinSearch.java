/* BinSearch.java */
// Collections' binarySearch algorithm demo
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinSearch {
  private static final String colors[] = {
    "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };
  private List<String> list = new ArrayList<String>(Arrays.asList(colors));

  // Constr-- create, sort and output list
  public BinSearch() {
    Collections.sort(list);
    System.out.printf("Sorted ArrayList: %s\n", list);
  }

  private void printSearchResults(String key) {
    int res = 0;

    System.out.printf("\nSearching for: %s\n", key);
    res = Collections.binarySearch(list, key);

    if (res >= 0) {
      System.out.printf("Found at index %d\n", res);
    } else {
      System.out.printf("Not found (%d)\n", res);
    }
  }
  
  // Search
  private void search() {
    printSearchResults(colors[3]); // black (first)
    printSearchResults(colors[0]); // red (middle)
    printSearchResults(colors[7]); // tan (last)
    printSearchResults("aqua");    // below first, does not exist
    printSearchResults("grey");    // does not exist
    printSearchResults("teal");    // does not exist
  }



  public static void main(String[] args) {
    BinSearch bs = new BinSearch();
    bs.search();
  }
}
