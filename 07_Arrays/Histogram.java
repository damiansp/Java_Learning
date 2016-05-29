// Print a histogram from an array of values
public class Histogram {
  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 4, 5, 2, 1, 1, 0, 0, 0, 1};

    System.out.println("Estimated Poisson Distribution (n = 20; lambda = 4)");

    for (int i = 0; i < array.length; i++) {
      // Print label
      System.out.printf("%2d  ", i);
      // Print histo
      for (int val = 0; val < array[i]; val++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
