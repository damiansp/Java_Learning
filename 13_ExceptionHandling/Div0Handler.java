/* Div0Handler.java */
// An exception handler that checks for division by 0
import java.util.InputMismatchException;
import java.util.Scanner;

public class Div0Handler {
  // demo /0 exception throwing
  public static int quotient(int num, int denom) throws ArithmeticException {
    return num / denom; // possible /0
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continueLoop = true; // determines if more input needed

    do {
      try {
        // read 2 nums, calculate quotient
        System.out.print("Enter an int numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("And an int denominator: ");
        int denominator = scanner.nextInt();
        int result = quotient(numerator, denominator);

        System.out.printf(
          "\nResult: %d / %d = %d\n", numerator, denominator, result);
        continueLoop = false; // input successful, exit loop
      } catch (InputMismatchException imException) {
        System.err.printf("\nException: %s\n", imException);
        scanner.nextLine();
        System.out.println("Must enter integers. Retrying...\n");
      } catch (ArithmeticException arithException) {
        System.err.printf("\nException: %s\n", arithException);
        System.out.println("Division by 0 undefined. Retrying...\n");
      }
    } while (continueLoop);
  }
}
