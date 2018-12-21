import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Sort {
  public static void main(String[] args) {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    List<String> list = Arrays.asList(suits);

    System.out.printf("Unsorted: %s\n", list);
    Collections.sort(list);
    System.out.printf("Sorted: %s\n", list);
    Collections.sort(list, Collections.reverseOrder());
    System.out.printf("Reversed: %s\n", list);
  }
}
