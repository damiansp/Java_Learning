public abstract class Employee {
  private final String firstName;
  private final String lastName;
  private final String ssn;

  public Employee(String firstName, String lastName, String ssn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
  }

  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public String getSSN() { return ssn; }

  @Override
  public String toString() {
    return String.format("%s, %s\nSSN: %s",
                         getLastName(), getFirstName(), getSSN());
  }

  public abstract double earnings(); 
}
