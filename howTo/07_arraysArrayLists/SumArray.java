public class SumArray {
  public static void main(String[] args) {
    int[] fibs = {0, 1, 1, 2, 3, 5, 8, 13};
    int total = 0;

    for (int i = 0; i < fibs.length; i++) {
      total += fibs[i];
    }

    System.out.printf(
      "Sum of first %d Fibonacci numbers: %d\n", fibs.length, total);
  }
}
