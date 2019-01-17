public class Factorial {
  public static long factorial(long n) {
    if (n <= 1) return 1;
    else return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 21; i++) {
      System.out.printf("%d! = %d\n", i, factorial(i));
      // Note overflow happens at 21
    }
  }
}
