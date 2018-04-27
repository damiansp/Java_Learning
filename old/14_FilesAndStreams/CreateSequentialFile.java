/* CreateSequentialFile.java */
// Write objects sequentially to file with ObjectOutputStream class
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import filesStreams.AccountRecordSerializable;

public class CreateSequentialFile {
  private ObjectOutputStream output; // outputs data to file

  // open user-named file
  public void openFile() {
    try {
      output = new ObjectOutputStream(new FileOutputStream("clients.ser"));
    } catch (IOException ioExc) {
      System.err.println("Error opening file.");
    }
  }

  // add records to file
  public void addRecords() {
    AccountRecordSerializable record; // obj to be written to file
    int accountNumber = 0;
    String firstName;
    String lastName;
    double balance;
    Scanner input = new Scanner(System.in);

    System.out.printf("%s\n\n", "To terminate input, type EOF (^D)");
    System.out.printf(
      "%s\n%s",
      "Enter account number (> 0), first name, last name, balance",
      "> ");

    while (input.hasNext()) {
      try { // obtain record vals from user
        accountNumber = input.nextInt();
        firstName     = input.next();
        lastName      = input.next();
        balance       = input.nextDouble();

        if (accountNumber > 0) {
          // create record
          record = new AccountRecordSerializable(
            accountNumber, firstName, lastName, balance);
          // write to file
          output.writeObject(record);
        } else {
          System.out.println("Account no. must be > 0");
        }
      } catch (IOException ioExc) {
        System.err.println("Error writing to file.");
        return;
      } catch (NoSuchElementException nseExc) {
        System.err.println("Invalid input; try again.");
        input.nextLine(); // discard input
      }

      System.out.printf(
        "%s\n%s",
        "Enter account number (> 0), first name, last name, balance",
        "> ");
    }
  }

  // Close file and end
  public void closeFile() {
    try {
      if (output != null) { output.close(); }
    } catch (IOException ioExc) {
      System.err.println("Error closing file.");
      System.exit(1);
    }
  }
}
