public class Employee {
  private String firstName;
  private String lastName;
  private double monthlySalary;

  // Constructor
  public Employee(String name, String surname, double wage) {
    firstName = name;
    lastName = surname;
    monthlySalary = (wage > 0.0) ? wage : 0.0;
  }



  // Getters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }



  // Setters
  public void setFirstName(String name) {
    firstName = name;
  }

  public void setLastName(String name) {
    lastName = name;
  }

  public void setMonthlySalary(double wage) {
    monthlySalary = (wage > 0.0) ? wage : 0.0;
  }
}
