/* ReversSort.java */
// Using a Comparator obj with Collections' sort algo
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSort {
  private static final String[] suits = {
    "Hearts", "Diamonds", "Clubs", "Spades" };

  // Display array elements
  public void printElements() {
    // Create list
    List<String> list = Arrays.asList(suits);

    // Output list
    System.out.printf("Unsorted array elements:\n%s\n", list);

    // Sort descending using a comparator
    Collections.sort(list, Collections.reverseOrder());

    // Output again
    System.out.printf("Sorted array elements:\n%s\n", list);
  }

  public static void main(String[] args) {
    ReverseSort rsort = new ReverseSort();
    rsort.printElements();
  }
}
