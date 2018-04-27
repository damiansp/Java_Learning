/* LinearArrayTest.java */
import java.util.Scanner;

public class LinearArrayTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int searchInt, // search key
      position;    // index of serach key

    // Create and output aray
    LinearArray searchArray = new LinearArray(10);
    System.out.println(searchArray);

    // Prompt user for input
    System.out.print("Enter and int value (-1 to quit): ");
    searchInt = input.nextInt();

    while (searchInt != -1) {
      // perform search
      position = searchArray.linearSearch(searchInt);

      if (position == -1) {
        System.out.println("The integer " + searchInt + " was not found\n");
      } else {
        System.out.println("The integer " + searchInt +
                           " was found at position " + position + "\n");
      }

      // reprompt
      System.out.println("Enter and int value (-1 to quit): ");
      searchInt = input.nextInt();
    }
  }
}
