import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsException {
  // Scan 3 doubles, assign to: principle, rate, (loan) years
  public static double[] scanValues() throws InputMismatchException {
    double[] values = new double[3];
    
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter the loan amount: ");
      values[0] = scan.nextDouble();
      System.out.print("Enter interest rate: ");
      values[1] = scan.nextDouble();
      System.out.print("Enter loan term (in years): ");
      values[2] = scan.nextInt();
    }

    return values;
  }


  // Take a double[3] and calculate monthly payments
  public static double calculatePayment(double[] values)
    throws ArithmeticException, IndexOutOfBoundsException {
    double principle = values[0];
    double rate = values[1];
    double years = values[2];
    double interest = principle * rate * years;
    double total = principle + interest;

    return total / years / 12;
  }

  

  // main ----------------------------------------
  public static void main(String[] args) {
    try {
      // store double[] returned by scanValues()
      double[] userValues = scanValues();

      // ...and by calculatePayment()
      double payment = calculatePayment(userValues);

      // Format $ amts
      DecimalFormat df = new DecimalFormat("0.##");

      // print formatted payment amt
      System.out.println("Monthly payment: $" + df.format(payment));
    } catch (InputMismatchException ime) {
      // user input cannot be parsed to double
      System.out.println("You must enter double values. Restart program.");
      System.exit(0);
    } catch (ArithmeticException ae) {
      // if years = 0; div /0 error
      System.out.println("Years must be > 0; restart program.");
      System.exit(0);
    } catch (IndexOutOfBoundsException ob) {
      // user didn't provide enough values to parse
      System.out.println("Three double values required; restart program.");
      System.exit(0);
    }
  }
}
