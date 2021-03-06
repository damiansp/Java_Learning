package methods;

import java.lang.reflect.*;


/** Invoking methods through reflection */
public class MethodTableTest {
  public static void main(String[] args) throws ReflectiveOperationException {
    // Get method ptrs to the square and sqrt methods
    Method square = MethodTableTest.class.getMethod("square", double.class);
    Method sqrt = Math.class.getMethod("sqrt", double.class);

    printTable(1, 10, 10, square);
    printTable(1, 10, 10, sqrt);
  }


  public static double square(double x) { return x * x; }


  public static void printTable(double from, double to, int n, Method f)
      throws ReflectiveOperationException {
    double dx = (to - from) / (n - 1);

    System.out.println(f);
    for (double x = from; x <= to; x += dx) {
      double y = (Double) f.invoke(null, x);
      System.out.printf("%10.4f | %10.4f\n", x, y);
    }
  }
}
