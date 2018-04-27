/* BinaryArrayTest.java */
import java.util.Scanner;

public class BinaryArrayTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Create and output array
    BinaryArray searchArray = new BinaryArray(25);

    System.out.println(searchArray);

    // Get input from user
    System.out.print("Integer to search for (-1 to quit): ");

    int searchInt = input.nextInt(),
      position;    // location of element
    
    System.out.println();

    // Allow user to repeatedly search, or exit on -1
    while (searchInt != -1) {
      // use binary search to find int
      position = searchArray.binarySearch(searchInt);

      // returns -1 if not found
      if (position == -1) {
        System.out.println(searchInt + " was not found\n");
      } else {
        System.out.println(
          searchInt + " was found in position " + position + "\n");
      }

      // Get next input from user
      System.out.print("Next int to search for (-1 to quit): ");
      searchInt = input.nextInt();
      System.out.println();
    }
  }
}
