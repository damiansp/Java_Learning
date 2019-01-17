import java.math.BigInteger;


public class BigIntFactorial {
  public static BigInteger factorial(BigInteger n) {
    if (n.compareTo(BigInteger.ONE) <= 0) return BigInteger.ONE;
    else return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 50; i++) {
      System.out.printf("%d! = %d\n", i, factorial(BigInteger.valueOf(i)));
    }
  }
}
