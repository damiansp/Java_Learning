import java.util.*;

/**
 * while loop demo
 */
public class Retirement {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("How much do you need to retire? ");
    double goal = in.nextDouble();

    System.out.print("How much will you contribute yearly? ");
    double payment = in.nextDouble();
    
    System.out.print("Interest rate in %: " );
    double interestRate = in.nextDouble();
    double balance = 200000;
    int years = 0;

    while (balance < goal) {
      balance += payment;
      double interest = balance * interestRate / 100;

      balance += interest;
      ++years;
    }
    System.out.println("You can retire in " + years + " years.");
  }
}
