// Employee.java
// Employee abstract superclass implements Payable
public abstract class Employee implements Payable {
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;

  // Constructor
  public Employee(String first, String last, String ssn) {
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
  }

  // Accessors
  public void setFirstName(String first) { firstName = first; }
  public void setLastName(String last) { lastName = last; }
  
  public void setSocialSecurityNumber(String ssn) {
    socialSecurityNumber = ssn;
  }

  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public String getSocialSecurityNumber() { return socialSecurityNumber; }

  // toString
  public String toString() {
    return String.format("%s %s\nSocial Security number: %s",
                         getFirstName(),
                         getLastName(),
                         getSocialSecurityNumber());
  }


  // NOTE: Payable method getPaymentAmount not implemented here--therefor this
  // class must be declared abstract to prevent compilation error
}
