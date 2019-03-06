public class MaxTest {
  public static void main(String[] args) {
    System.out.printf("Maximum of %d, %d, and %d: %d\n",
                      3, 4, 5, maximum(3, 4, 5));
    System.out.printf("Maximum of %.1f, %.1f, and %.1f: %.1f\n",
                      6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
    System.out.printf(
      "Maximum of %s, %s, and %s: %s\n",
      "pear", "orange", "apple", maximum("pear", "orange", "apple"));
  }


  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
    T max = x;
    if (y.compareTo(max) > 0) max = y;
    if (z.compareTo(max) > 0) max = z;
    return max;
  }
}
