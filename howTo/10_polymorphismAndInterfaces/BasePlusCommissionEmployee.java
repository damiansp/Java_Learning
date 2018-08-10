public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  public BasePlusCommissionEmployee(
      String firstName, String lastName, String ssn, double grossSales,
      double commissionRate, double baseSalary) {
    super(firstName, lastName, ssn, grossSales, commissionRate);
    if (isValid(baseSalary)) { this.baseSalary = baseSalary; }
  }

  private boolean isValid(double baseSalary) {
    if (baseSalary < 0.0) {
      throw new IllegalArgumentException("Base salary cannot be negative.");
    }
    return true;
  }

  public void setBaseSalary(double baseSalary) {
    if (isValid(baseSalary)) { this.baseSalary = baseSalary; }
  }

  public double getBaseSalary() { return baseSalary; }

  @Override
  public double earnings() {
    return getBaseSalary() + super.earnings();
  }

  @Override
  public String toString() {
    return String.format(
      "Base-Salaried %s\n Base Salary: %.2f",
      super.toString(), getBaseSalary());
  }
}
