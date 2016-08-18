/* Fibonacci.java */
// Recursive Fibonacci sequence

public class Fibonacci {
  // calculate
  public long fibonacci(long n) {
    if (( n == 0) || (n == 1)) {
      // base cases
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  // display first 11 numbers in sequence
  public void displayFibonacci() {
    for (int i = 0; i <= 10; i++) {
      System.out.printf("fibonacci(%d) = %d\n", i, fibonacci(i));
    }
  }
}
