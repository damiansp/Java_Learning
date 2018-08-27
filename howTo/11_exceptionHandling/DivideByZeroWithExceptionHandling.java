import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
  public static int quotient(int num, int denom) throws ArithmeticException {
    return num / denom;
  }

  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continueLoop = true;

    do {
      try {
        System.out.print("Numerator: ");
        int num = scanner.nextInt();
        System.out.print("Denominator: ");
        int denom = scanner.nextInt();
        int result = quotient(num, denom);
        System.out.printf("%d / %d = %d\n", num, denom, result);
        continueLoop = false;
      } catch (InputMismatchException e) {
        System.err.printf("\nException: %s\n", e);
        scanner.nextLine(); // discard input, reset to try again
        System.out.printf("Integers only: ");
      } catch (ArithmeticException e) {
        System.err.printf("\nExcetpion: %s\n", e);
        System.out.printf("Cannot divide by 0; try again.\n\n");
      }
    } while (continueLoop);
  }
}
