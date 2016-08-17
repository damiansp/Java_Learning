/* ReadSequentialFile.java */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import filesStreams.AccountRecordSerializable;

public class ReadSequentialFile {
  private ObjectInputStream input;

  // open file
  public void openFile() {
    try {
      input = new ObjectInputStream(new FileInputStream("clients.ser"));
    } catch (IOException ioExc) {
      System.err.println("Error opening file");
    }
  }

  // read record from file
  public void readRecords() {
    AccountRecordSerializable record;

    System.out.printf("%-10s%-12s%-12s%10s\n",
                      "Account",
                      "First Name",
                      "Last Name",
                      "Balance");
    try {
      while (true) {
        record = (AccountRecordSerializable) input.readObject();

        // display record
        System.out.printf("%-10d%-12s%-12s%10.2f\n",
                          record.getAccount(),
                          record.getFirstName(),
                          record.getLastName(),
                          record.getBalance());
      }
    } catch (EOFException eofExc) {
      return;
    } catch (ClassNotFoundException cnfExc) {
      System.err.println("Unable to create object.");
    } catch (IOException ioExc) {
      System.err.println("Error reading from file.");
    }
  }

  // close file, terminate
  public void closeFile() {
    try {
      if (input != null) { input.close(); }
    } catch (IOException ioExc) {
      System.err.println("Error closing file.");
      System.exit(1);
    }
  }
}
