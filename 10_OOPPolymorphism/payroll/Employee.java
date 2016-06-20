// Employee.java
// Employee abstract superclass
public abstract class Employee {
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
  public void setSocialSecurityNumber(String ssn) { socialSecurityNumber = ssn; }

  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public String getSocialSecurityNumber() { return socialSecurityNumber; }

  // toString
  public String toStrin() {
    return String.format("%s %s\nSocial Security Numebr: %s",
                         getFirstName(), getLastName(), getSocialSecurityNumber());
  }


  // abstract method overridden by subclasses:
  public abstract double earnings(); // no implementation here
}
