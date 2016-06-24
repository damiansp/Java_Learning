// Transaction.java
// Abstract class Transaction represents an ATM transaction
public abstract class Transaction {
  private int accountNumber;
  private Screen screen;
  private BankDatabase bankDB;

  // Constructor
  public Transaction() {}

  // Accessors
  public int getAccountNumber() {}
  public Screen getScreen() {}
  public BankDatabase getBankDatabase() {}

  // Other
  // Execute transaction
  public abstract void execute();
}
