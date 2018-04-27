/* AccountRecord.java */
// Represents a single record of info
package filesStreams;

public class AccountRecord {
  private int account;
  private String firstName;
  private String lastName;
  private double balance;

  // Acc
  public void setAccount(int acct) { account = acct; }
  public int getAccount() { return account; }
  public void setFirstName(String first) { firstName = first; }
  public String getFirstName() { return firstName; }
  public void setLastName(String last) { lastName = last; }
  public String getLastName() { return lastName; }
  public void setBalance(double bal) { balance = bal; }
  public double getBalance() { return balance; }
  
  // Constr (def)
  public AccountRecord() {
    this(0, "", "", 0.00);
  }

  // Constr (init)
  public AccountRecord(int acct, String first, String last, double bal) {
    setAccount(acct);
    setFirstName(first);
    setLastName(last);
    setBalance(bal);
  }
}
  
