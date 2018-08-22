import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
  public static int quotient(int numerator, int denominator) {
    return numerator / denominator;  // possible div by 0
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Denominator: ");
    int denominator = scanner.nextInt();
    int result = quotient(numerator, denominator);
    System.out.printf(
      "\nResult: %d / %d = %d\n", numerator, denominator, result);
  }
}
