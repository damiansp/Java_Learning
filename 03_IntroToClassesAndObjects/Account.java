public class Account {
  private double balance;

  // Constructor
  public Account(double initialBalance) {
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
}
