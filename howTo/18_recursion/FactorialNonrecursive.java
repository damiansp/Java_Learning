public class FactorialNonrecursive {
  public static long factorial(long n) {
    long result = 1;
    for (long i = n; i >= 1; i--) result *= i; 
    return result;
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d! = %d\n", i, factorial(i));
    }
  }
}
