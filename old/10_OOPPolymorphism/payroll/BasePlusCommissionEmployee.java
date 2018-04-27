// BasePlusCommissionEmployee.java
// BaseBlusCommissionEmployee class extends CommissionEmployee
public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  // Accessors
  public void setBaseSalary(double salary) {
    baseSalary = (salary < 0.0) ? 0.0 : salary;
  }

  public double getBaseSalary() { return baseSalary; }
  
  // Constructor
  public BasePlusCommissionEmployee(
    String first, String last, String ssn, double sales, double rate, double salary)
  {
    super(first, last, ssn, sales, rate);
    setBaseSalary(salary);
  }

  // toString
  public String toString() {
    return String.format("%s %s; %s: $%,.2f",
                         "base-salaried",
                         super.toString(),
                         "base salary",
                         getBaseSalary());
  }



  // calculate earnings; override method in CommissionEmployee
  public double earnings() {
    return getBaseSalary() + super.earnings();
  }
}
