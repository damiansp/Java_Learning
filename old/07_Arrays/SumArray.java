// Compute the sum of array elements
public class SumArray {
  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
    int total = 0;

    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }

    System.out.printf("Total of the array elements:\n> %d\n", total);
  }
}
