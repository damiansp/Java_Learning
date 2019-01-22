import java.math.BigInteger;


public class FibonacciCalculator {
  private static BigInteger TWO = BigInteger.valueOf(2);

  public static BigInteger fibonacci(BigInteger n) {
    if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) return n;
    else {
      return fibonacci(
        n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(TWO)));
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 40; i++) {
      System.out.printf(
        "Fibonacci of %3d: %9d\n", i, fibonacci(BigInteger.valueOf(i)));
    }
  }
}
