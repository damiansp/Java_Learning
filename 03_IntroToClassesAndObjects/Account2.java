public class Account2 {
  private double balance;

  // Constructor
  public Account2(double initialBalance) {
    // Validate input
    balance = initialBalance > 0.0 ? initialBalance : 0.0;
  }

  // Give account balance
  public double getBalance() {
    return balance;
  }
  
  // Add to account
  public void credit(double amount) {
    balance += amount;
    System.out.println(this.getBalance());
  }

  // Debit account
  public void debit(double amount) {
    // Check for sufficient funds
    if (this.getBalance() >= amount) {
      balance -= amount;
      System.out.println(this.getBalance());
    } else {
      System.out.println("Insufficient funds.");
    }
  }
}
