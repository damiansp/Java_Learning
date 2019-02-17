import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


public class LinearSearchTest {
  public static int linearSearch(int[] data, int searchKey) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == searchKey) return i;
    }
    return -1; // value not found
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    SecureRandom generator = new SecureRandom();
    int[] data = new int[10];
    for (int i = 0; i < data.length; i++) data[i] = 10 + generator.nextInt(90);
    System.out.printf("%s\n\n", Arrays.toString(data));
    System.out.printf("Enter an integer value (-1 to quit): ");
    int searchInt = input.nextInt();
    while (searchInt != -1) {
      int position = linearSearch(data, searchInt);
      if (position == -1) System.out.printf("%d was not found\n\n", searchInt);
      else System.out.printf("%d found at index %d\n\n", searchInt, position);
      System.out.print("Enter an integer value (-1 to quit): ");
      searchInt = input.nextInt();
    }
  }
}
