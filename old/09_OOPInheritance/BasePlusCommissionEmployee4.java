// Demonstrates inheritance from CommissionEmployee class
public class BasePlusCommissionEmployee4 extends CommissionEmployee4 {
  private double baseSalary; // weekly

  // Accessors
  public void setBaseSalary(double salary) {
    baseSalary = (salary < 0.0) ? 0.0 : salary;
  }

  public double getBaseSalary() {
    return baseSalary;
  }
  
  // Constructor
  public BasePlusCommissionEmployee4(String first,
                                     String last,
                                     String ssn,
                                     double sales,
                                     double rate,
                                     double salary) {
    // call superclass constructor
    super(first, last, ssn, sales, rate);
    setBaseSalary(salary);

    System.out.printf("\nBasePlusCommissionEmployee4 constructor:\n%s\n", this);
  }

  // toString
  public String toString() {
    return String.format("%s %s\n%s: %.2f",
                         "base-salaried",
                         super.toString(),
                         "base salary",
                         getBaseSalary());
  }
  

  public double earnings() {
    return getBaseSalary() + super.earnings();
  }
}
