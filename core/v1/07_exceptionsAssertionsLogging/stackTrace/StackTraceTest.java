package stackTrace;

import java.util.*;


public class StackTraceTest {
  public static void main(String[] args) {
    try (var in = new Scanner(System.in)) {
      System.out.print("Enter n: ");
      int n = in.nextInt();
      factorial(n);
    }
  }

  public static int factorial(int n) {
    System.out.println("factorial(" + n + "):");
    var walker = StackWalker.getInstance();
    int r;
    
    walker.forEach(System.out::println);
    if (n <= 1) r = 1;
    else r = n * factorial(n - 1);
    System.out.println("return " + r);
    return r;
  }
}
