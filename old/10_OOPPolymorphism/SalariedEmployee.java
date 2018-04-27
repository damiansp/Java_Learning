// SalariedEmployee.java
// SalraiedEmployee class extends Employee, which implements Payable
public class SalariedEmployee extends Employee {
  private double weeklySalary;
  
  // Accessors
  public void setWeeklySalary(double salary) {
    weeklySalary = salary < 0.0 ? 0.0 : salary;
  }

  public double getWeeklySalary() { return weeklySalary; }
  
  // Constructor
  public SalariedEmployee(String first, String last, String ssn, double salary)
  {
    super(first, last, ssn);
    setWeeklySalary(salary);
  }

  // toString
  public String toString() {
    return String.format("Salaried employee: %s\n%s: $%,.2f",
                         super.toString(),
                         "weekly salary",
                         getWeeklySalary());
  }



  // Calculate earnings; implement Payable interface method that was abstract
  // in Employee superclass
  public double getPaymentAmount() {
    return getWeeklySalary();
  }
}
