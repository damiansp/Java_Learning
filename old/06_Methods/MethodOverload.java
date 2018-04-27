// Overloaded method demo
public class MethodOverload {
  public int square(int n) {
    System.out.printf("\nCalled square(int %d)\n", n);
    return n * n;
  }

  public double square(double n) {
    System.out.printf("\nCalled square(double %f)\n", n);
    return n * n;
  }
  
  public void testOverloadedMethods() {
    System.out.printf("(int) 7^2 = %d\n", square(7));
    System.out.printf("(double) 7.5^2 = %f\n", square(7.5));
  }
}
