public class VarArgsTest {
  public static double average(double... numbers) {
    double total = 0.0;

    for (double d: numbers) {
      total += d;
    }
    return total / numbers.length;
  }


  public static void main(String[] args) {
    double d1 = 10.,
      d2 = 20.,
      d3 = 30.,
      d4 = 50.;

    System.out.printf("mean(d1, d2): %.2f\n", average(d1, d2));
    System.out.printf("mean(d1, d2, d3): %.2f\n", average(d1, d2, d3));
    System.out.printf("mean(d1, d2, d3, d4): %.2f\n", average(d1, d2, d3, d4));
  }
}
