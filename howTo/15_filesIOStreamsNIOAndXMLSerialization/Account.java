public class Account {
  private int accountNumber;
  private String firstName;
  private String lastName;
  private double balance;


  public Account(
      int accountNumber, String firstName, String lastName, double balance) {
    this.accountNumber = accountNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }
  
  public Account() { this(0, "", "", 0.0); }


  public int getAccountNumber() { return accountNumber; }
  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public double getBalance() { return balance; }
  

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
  public void setFirstName(String firstName) { this.firstName = firstName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public void setBalance(double balance) { this.balance = balance; }
}
