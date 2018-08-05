public class CommissionEmployee {
  private final String firstName;
  private final String lastName;
  private final String ssn;
  private double grossSales;
  private double commissionRate;

  public CommissionEmployee(
      String firstName, String lastName, String ssn, double grossSales,
      double commissionRate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
    if (isValidSales(grossSales)) { this.grossSales = grossSales; }
    if (isValidCommission(commissionRate)) {
      this.commissionRate = commissionRate;
    }
  }

  private boolean isValidSales(double grossSales) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales cannot be positive");
    }
    return true;
  }

  private boolean isValidCommission(double commissionRate) {
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      throw new IllegalArgumentException("Commission Rate must be on (0, 1)");
    }
    return true;
  }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }

  public String getSSN() { return ssn; }

  public void setGrossSales(double grossSales) {
    if (isValidSales(grossSales)) { this.grossSales = grossSales; }
  }

  public double getGrossSales() { return grossSales; }

  public void setCommissionRate(double commissionRate) {
    if (isValidCommission(commissionRate)) {
      this.commissionRate = commissionRate;
    }
  }

  public double getCommissionRate() { return commissionRate; }

  public double earnings() { return getCommissionRate() * getGrossSales(); }

  @Override
  public String toString() {
    return String.format(
      "Commission Employee: %s, %s\n SSN: %s\n Sales: $%.2f\n Commission: %.2f",
      getLastName(), getFirstName(), getSSN(), getGrossSales(),
      getCommissionRate());
  }
}
