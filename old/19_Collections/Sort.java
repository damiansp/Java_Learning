/* Sort.java */
// Using Collections' sort algorithm
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
  private static final String[] suits = {
    "Hearts", "Diamonds", "Clubs", "Spades" };

  // Display array elements
  public void printElements() {
    // Create list
    List<String> list = Arrays.asList(suits);

    // Output list
    System.out.printf("Unsorted array elements:\n%s\n", list);

    Collections.sort(list);

    // Output again
    System.out.printf("Sorted array elements:\n%s\n", list);
  }

  public static void main(String[] args) {
    Sort sort = new Sort();
    sort.printElements();
  }
}
