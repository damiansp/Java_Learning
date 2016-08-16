/* AccountRecordSerializable.java */
// Represens one record of info
package filesStreams;

import java.io.Serializable;

public class AccountRecordSerializable implements Serializable {
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
  public AccountRecordSerializable() {
    this(0, "", "", 0.0);
  }

  // Constr (init all)
  public AccountRecordSerializable(
    int acct, String first, String last, double bal) {
    setAccount(acct);
    setFirstName(first);
    setLastName(last);
    setBalance(bal);
  }
}
  
