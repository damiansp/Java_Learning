// Using static import with class Math
import static java.lang.Math.*;

public class StaticImport {
  public static void main(String[] args) {
    System.out.printf("sqrt(900.0) = %.2f\n", sqrt(900.0));
    System.out.printf("ceil(-9.7) = %.1f\n", ceil(-9.7));
    System.out.printf("log(E) = %.2f\n", log(E));
    System.out.printf("cos(0.0) = %.2f\n", cos(0.0));
  }
}
