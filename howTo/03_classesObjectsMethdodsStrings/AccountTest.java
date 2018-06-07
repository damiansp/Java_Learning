// AccountTest.java
import java.util.Scanner;

public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account("Jane G. Green", 50.00);
    Account account2 = new Account("Sylas C. Blue", -7.53);
    Scanner input = new Scanner(System.in);
    Account[] accounts = {account1, account2};

    printAccounts(accounts);
    System.out.printf("Enter deposit amount for %s's account: ",
                      account2.getName());
    double depositAmount = input.nextDouble();
    account2.deposit(depositAmount);
    printAccounts(accounts);

    System.out.printf("Enter withdrawal amount for %s's account: ",
                      account1.getName());
    double withdrawalAmount = input.nextDouble();
    double cashDispensed = account1.withdraw(withdrawalAmount);
    System.out.printf("You have cash in the amount of $%.2f.\n", cashDispensed);
    printAccounts(accounts);   
  }

  public static void printAccounts(Account[] accounts) {
    for (int i=0; i < accounts.length; i++) {
      System.out.printf("%s's account has $%.2f\n",
                        accounts[i].getName(),
                        accounts[i].getBalance());
    }
  }
}


