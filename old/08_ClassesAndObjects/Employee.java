// Employee class with ref to Date objects

public class Employee {
  private String firstName;
  private String lastName;
  private Date birthDate;
  private Date hireDate;

  // Constructor
  public Employee(String first, String last, Date dob, Date dateHired) {
    firstName = first;
    lastName = last;
    birthDate = dob;
    hireDate = dateHired;
  }

  // toString
  public String toString() {
    return String.format("%s, %s; Hired: %s; Date of Birth: %s",
                         lastName, firstName, hireDate, birthDate);
  }
}
