import java.util.*;


/** 
 * Array manipulation
 * Derived from Horstmann (2018) "Core Java Vol. I"
 */
public class LotteryDrawing {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("How many numbers do you need? ");
    int k = in.nextInt();

    System.out.print("Max number? ");
    int n = in.nextInt();
    int[] numbers = new int[n]; // Make an array 1...n

    for (int i = 0; i < numbers.length; i++) { numbers[i] = i + 1; }
    int[] result = new int[k]; // Draw k numbers and store

    for (int i = 0; i < result.length; i++) {
      int r = (int) (Math.random() * n); // rand idx on [0, n - 1]

      result[i] = numbers[r];
      // Remove number from list by moving last element there and...
      numbers[r] = numbers[n - 1];
      n--; // not allowing last no. to be selected
    }

    Arrays.sort(result);
    System.out.println(
      "Bet the following random, my possibly winning numbers:");
    for (int r: result) { System.out.println(r); }
  }
}
