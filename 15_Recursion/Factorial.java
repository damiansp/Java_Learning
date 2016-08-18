/* Factorial.java */
// Recursive factorial method

public class Factorial {
  public long factorial(long n) {
    if (n <= 1) {
      // base case
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  // output factorials for 0 - 10
  public void displayFactorials() {
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d! = %d\n", i, factorial(i));
    }
  }
}
