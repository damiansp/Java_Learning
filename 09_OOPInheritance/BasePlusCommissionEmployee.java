// Demonstrates inheritance from CommissionEmployee class
public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary; // weekly

  // Accessors
  public void setBaseSalary(double salary) {
    baseSalary = (salary < 0.0) ? 0.0 : salary;
  }

  public double getBaseSalary() {
    return baseSalary;
  }
  
  // Constructor
  public BasePlusCommissionEmployee(String first,
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
    // not allowed: attempts to access private superclass memers
    return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
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
    // not allowed: commissionRate and grossSales private in superclass
    return baseSalary + (commissionRate * grossSales);
  }

  
}
