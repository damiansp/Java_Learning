public class MethodOverload {
  public static void main(String[] args) {
    System.out.printf("Square of int 8: %d\n", square(8));
    System.out.printf("Square of double 8.8: %f\n", square(8.8));
  }

  
  public static int square(int n) {
    return n * n;
  }

  
  public static double square(double n) {
    return n * n;
  }
}
