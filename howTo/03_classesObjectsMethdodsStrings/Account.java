// Account.java

public class Account {
  private String name;
  private double balance;

  public Account(String name, double balance) {
    this.name = name;
    if (balance > 0.0) {
      this.balance = balance;
    } else {
      this.balance = 0.0;
    }
  }

  public void deposit(double amount) {
    if (amount > 0.0) {
      balance += amount;
    } else {
      System.out.println("Deposit amount must be greater than 0.");
    }
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
