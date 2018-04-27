// Demonstrates inheritance from CommissionEmployee class
public class BasePlusCommissionEmployee2 extends CommissionEmployee2 {
  private double baseSalary; // weekly

  // Accessors
  public void setBaseSalary(double salary) {
    baseSalary = (salary < 0.0) ? 0.0 : salary;
  }

  public double getBaseSalary() {
    return baseSalary;
  }
  
  // Constructor
  public BasePlusCommissionEmployee2(String first,
                                     String last,
                                     String ssn,
                                     double sales,
                                     double rate,
                                     double salary) {
    // call superclass constructor
    super(first, last, ssn, sales, rate);
    setBaseSalary(salary);
  }

  // toString
  public String toString() {
    return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n",
                         "base-salaried commission employee",
                         firstName,
                         lastName,
                         "social security number",
                         socialSecurityNumber,
                         "gross sales",
                         grossSales,
                         "commission rate",
                         commissionRate,
                         "base salary",
                         baseSalary);
  }
  

  public double earnings() {
    return baseSalary + (commissionRate * grossSales);
  }

  
}
