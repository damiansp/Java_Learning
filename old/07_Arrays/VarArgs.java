/* Using variable-length arg lists */
public class VarArgs {
  // Calculate mean
  public static double mean(double... numbers) {
    double total = 0.0;

    for (double d: numbers) {
      total += d;
    }

    return total / numbers.length;
  }

  public static void main(String[] args) {
    double d1 = 11.1,
      d2 = 22.2,
      d3 = 33.3,
      d4 = 44.4;

    System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
                      d1, d2, d3, d4);
    System.out.printf("mean(d1, d2):\n> %.1f\n", mean(d1, d2));
    System.out.printf("mean(d1, d2, d3):\n> %.1f\n", mean(d1, d2, d3));
    System.out.printf("mean(d1, d2, d3, d4):\n> %.1f\n", mean(d1, d2, d3, d4));
                                        
  }
}
