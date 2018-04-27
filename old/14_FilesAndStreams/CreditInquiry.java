/* CreditInquiry.java */
// Program reads a file sequentially and displays contents based on the type
// of account the user requests (credit, debit, or zero).
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import filesStreams.AccountRecord;

public class CreditInquiry {
  private MenuOption accountType;
  private Scanner input;
  private MenuOption[] choices = { MenuOption.ZERO_BALANCE,
                                   MenuOption.CREDIT_BALANCE,
                                   MenuOption.DEBIT_BALANCE,
                                   MenuOption.END };

  // use record type to determine if record should be displayed
  private boolean shouldDisplay(double balance) {
    if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
      return true;
    } else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
      return true;
    } else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0)) {
      return true;
    }

    return false;
  }

  
  // read records from file and display as appropriate
  private void readRecords() {
    // obj to be written to file
    AccountRecord record = new AccountRecord();

    try {
      // open file to read from beginning
      input = new Scanner(new File("clients.txt"));

      while(input.hasNext()) {
        // input the vals from the file
        record.setAccount(input.nextInt());
        record.setFirstName(input.next());
        record.setLastName(input.next());
        record.setBalance(input.nextDouble());

        // if proper acct type, display record
        if (shouldDisplay(record.getBalance())) {
          System.out.printf("%-10d%-12s%-12s%10.2f\n",
                            record.getAccount(),
                            record.getFirstName(),
                            record.getLastName(),
                            record.getBalance());
        }
      }
    } catch (NoSuchElementException nseExc) {
      System.err.println("File improperly formed.");
      input.close();
      System.exit(1);
    } catch (IllegalStateException isExc) {
      System.err.println("Error reading from file.");
      System.exit(1);
    } catch (FileNotFoundException fnfExc) {
      System.err.println("File not found.");
      System.exit(1);
    } finally {
      if (input != null) {
        input.close();
      }
    }
  }

  // Obtain request from user
  private MenuOption getRequest() {
    Scanner textIn = new Scanner(System.in);
    int request = 1;

    // Display options
    System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                      "Enter request",
                      " 1: List 0 balance accounts",
                      " 2: List credit balance accounts",
                      " 3: List debit balance accounts",
                      " 4: End");
    try {
      do {
        System.out.print("\n> ");
        request = textIn.nextInt();
      } while ((request < 1) || (request > 4));
    } catch (NoSuchElementException nseExc) {
      System.err.println("Invalid input.");
      System.exit(1);
    }

    return choices[request - 1];
  }

  public void processRequests() {
    // get user's request (0, debit, credit)
    accountType = getRequest();

    while (accountType != MenuOption.END) {
      switch (accountType) {
      case ZERO_BALANCE:
        System.out.println("\nAccounts with zero balance:\n"); break;
      case CREDIT_BALANCE:
        System.out.println("\nAccounts with credit balance:\n"); break;
      case DEBIT_BALANCE:
        System.out.println("\nAccounts with debit balance:\n"); break;
      }

      readRecords();
      accountType = getRequest();
    }
  }
}
