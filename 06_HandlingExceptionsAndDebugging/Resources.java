import java.text.DecimalFormat;
import java.util.Scanner;

public class Resources {
  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      System.out.println("Enter loan amount: ");
      double principle = scan.nextDouble();
      System.out.println("Enter interest rate: ");
      double rate = scan.nextDouble();
      System.out.println("Enter the term of the loan (in years): ");
      double years = scan.nextInt();

      double interest = principle * rate * years;
      double total = principal + interest;
      double payment = total / years / 12; // monthly
      
      DecimalFormat df = new DecimalFormat ("0.##");
      System.out.println("Monthly payment: $" + df.format(payment));
    } catch (Exception exc) {
      System.out.println(exc);
    } finally {
      scan.close();
    }
  }
}
