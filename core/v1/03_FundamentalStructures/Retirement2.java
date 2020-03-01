import java.util.*;

/** do.. while demo */
public class Retirement2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Annual Contribution: ");
    double payment = in.nextDouble();

    System.out.println("Interest rate as %: ");
    double interestRate = in.nextDouble();
    double balance = 220000;
    int year = 0;
    String input;

    do {
      balance += payment;
      double interest = balance * interestRate / 100;

      balance += interest;
      year++;
      System.out.printf("Year %d\tbalance: %,.2f\n", year, balance);
      System.out.print("Ready to retire? (Y/N): ");
      input = in.next();
    } while (input.equals("N"));
  }
}
  
