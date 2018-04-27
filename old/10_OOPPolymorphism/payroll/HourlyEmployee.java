// HourlyEmployee.java
// HourlyEmployee class extends Employee
public class HourlyEmployee extends Employee {
  private double wage; // hourly
  private double hours; // worked per week

  // Accessors
  public void setWage(double hourlyWage) {
    wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
  }

  public void setHours(double hoursWorked) {
    hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ? hoursWorked : 0.0;
  }

  public double getWage() { return wage; }
  public double getHours() { return hours; }
  
  // Constructor
  public HourlyEmployee(
    String first, String last, String ssn, double hourlyWage, double hoursWorked) {
    super(first, last, ssn);
    setWage(hourlyWage);
    setHours(hoursWorked);
  }

  // toString
  public String toString() {
    return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                         super.toString(),
                         "hourly wage",
                         getWage(),
                         "hours worked",
                         getHours());
  }

  

  // Calculate earnings; override abstract method in Employee
  public double earnings() {
    if (getHours() <= 40) {
      return getWage() * getHours();
    } else {
      // overtime
      return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
  }
}
