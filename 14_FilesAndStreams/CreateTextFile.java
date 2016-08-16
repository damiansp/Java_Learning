/* CreateTextFile.java */
// Write data to a text file with class Formatter
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import filesStreams.AccountRecord;

public class CreateTextFile {
  private Formatter output;
  
  // Let user open file
  public void openFile() {
    try {
      output = new Formatter("clients.txt");
    } catch (SecurityException securityExc) {
      System.err.println("You do not have access to this file.");
      System.exit(1);
    } catch (FileNotFoundException fnfExc) {
      System.err.println("Error creating file.");
      System.exit(1);
    }
  }

  // Add records to file
  public void addRecords() {
    // Obj to be written to file
    AccountRecord record = new AccountRecord();
    Scanner input = new Scanner(System.in);

    System.out.printf("%s\n\n", "EOF (^D) to terminate");
    System.out.printf(
      "%s\n%s",
      "Enter account no. (> 0), first name, last name, and balance",
      "> ");

    while(input.hasNext()) {
      try {
        // Set record data
        record.setAccount(input.nextInt());
        record.setFirstName(input.next());
        record.setLastName(input.next());
        record.setBalance(input.nextDouble());

        if (record.getAccount() > 0) {
          // Write new record
          output.format("%d %s %s %.2f\n",
                        record.getAccount(),
                        record.getFirstName(),
                        record.getLastName(),
                        record.getBalance());
        } else {
          System.out.println("Account no. must be > 0.");
        }
      } catch (FormatterClosedException fcExc) {
        System.err.println("Error writing to file.");
        return;
      } catch (NoSuchElementException nseExc) {
        System.err.println("Invalid input. Please try again.");
        input.nextLine();
      }

      System.out.printf(
        "%s\n%s",
        "Enter account number (> 0), first name, last name, and balance",
        "> ");
    }
  }

  
  // Close file
  public void closeFile() {
    if (output != null) {
      output.close();
    }
  }
}
