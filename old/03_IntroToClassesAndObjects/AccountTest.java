import java.util.Scanner;

public class AccountTest {
  public static void main(String[] args) {
    Account acc1 = new Account(50.00);
    Account acc2 = new Account(-7.53);

    // Display initial balances
    System.out.printf("acc1 balance: $%.2f\n", acc1.getBalance());
    System.out.printf("acc2 balance: $%.2f\n", acc2.getBalance());

    // Create scanner
    Scanner input = new Scanner(System.in);
    double depositAmount;

    // Read deposit amt fr user
    System.out.print("Enter deposit amount for acc1: ");
    depositAmount = input.nextDouble();
    System.out.printf("\nAdding %.2f to acc1 balance\n\n", depositAmount);
    acc1.credit(depositAmount);

    // Rep for acc2
    System.out.print("Enter deposit amount for acc2: ");
    depositAmount = input.nextDouble();
    System.out.printf("\nAdding %.2f to acc2 balance\n\n", depositAmount);
    acc2.credit(depositAmount);

    // Display balances
    System.out.printf("acc1 balance: $%.2f\n", acc1.getBalance());
    System.out.printf("acc2 balance: $%.2f\n", acc2.getBalance());
  }
}
