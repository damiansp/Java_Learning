import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearchTest {
  public static int binarySearch(int[] data, int key) {
    int low = 0;
    int high = data.length - 1;
    int mid = (low + high + 1) / 2;
    int location = -1;
    do {
      System.out.print(remainingElements(data, low, high));
      for (int i = 0; i < mid; i++) System.out.print("  ");
      System.out.println(" * ");
      if (key == data[mid]) location = mid;
      else if (key < data[mid]) high = mid - 1;
      else low = mid + 1;
      mid = (low + high + 1) / 2;
    } while ((low <= high) && (location == -1));
    return location;
  }

  
  private static String remainingElements(int[] data, int low, int high) {
    StringBuilder temp = new StringBuilder();
    for (int i = 0; i < low; i++) temp.append("  ");
    for (int i = low; i <= high; i++) temp.append(data[i] + " ");
    return String.format("%s\n", temp);
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    SecureRandom generator = new SecureRandom();
    int[] data = generator.ints(15, 10, 91).sorted().toArray();
    System.out.printf("%s\n\n", Arrays.toString(data));
    System.out.print("Please enter an int (-1 to quit) > ");
    int searchInt = input.nextInt();
    while (searchInt != -1) {
      int location = binarySearch(data, searchInt);
      if (location == -1) System.out.printf("%d was not found\n\n", searchInt);
      else System.out.printf("%d found at index %d\n\n", searchInt, location);
      System.out.print("Please enter an int (-1 to quit) > ");
      searchInt = input.nextInt();
    }
  }
}
