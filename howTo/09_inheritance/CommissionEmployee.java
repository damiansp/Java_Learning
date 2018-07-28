// ComissionEmployee represents an employee paid a percentage of gross sales
public class CommissionEmployee extends Object {
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;
  private double grossSales; // weekly
  private double commissionRate;

  public CommissionEmployee(
      String firstName, String lastName, String socialSecurityNumber,
      double grossSales, double commissionRate) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales cannot be negative");
    }
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      throw new IllegalArgumentException("Commission rate must be on (0, 1).");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
  }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }

  public String getSocialSecurityNumber() { return socialSecurityNumber; }

  public double getCommissionRate() { return commissionRate; }

  public double getGrossSales() { return grossSales; }

  public void setGrossSales(double GrossSales) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales cannot be negative");
    }
    this.grossSales = grossSales;
  }

  public void setCommissionRate(double commissionRate) {
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      throw new IllegalArgumentException("Commission rate must be on (0, 1).");
    }
    this.commissionRate = commissionRate;
  }

  public double calculateEarnings() { return commissionRate * grossSales; }

  @Override // overrides superclass method
  public String toString() {
    return String.format(
      "Commision Employee: %s, %s\n SSN: %s\n Gross Sales: $%.2f\n Commission " +
      "Rate: %.2f",
      lastName, firstName, socialSecurityNumber, grossSales, commissionRate);
  }
}
