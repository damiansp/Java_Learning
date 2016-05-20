import java.util.Scanner;

public class AccountTest2 {
  public static void main(String[] args) {
    Account2 acc1 = new Account2(50.00);
    Account2 acc2 = new Account2(-7.53);

    // Display initial balances
    System.out.printf("acc1 balance: $%.2f\n", acc1.getBalance());
    System.out.printf("acc2 balance: $%.2f\n", acc2.getBalance());

    // Create scanner
    Scanner input = new Scanner(System.in);
    double depositAmount, debitAmount;

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

    // Debit from useres
    System.out.print("Enter debit amount for acc1: ");
    debitAmount = input.nextDouble();
    System.out.printf("\nAttempting to withdraw %.2f from acc1: ",
                      debitAmount);
    acc1.debit(debitAmount);

    System.out.printf("acc1 balance: $%.2f\n", acc1.getBalance());
                     
  }
}
