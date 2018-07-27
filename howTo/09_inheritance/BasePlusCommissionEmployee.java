public class BasePlusCommissionEmployee {
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;
  private double grossSales;
  private double commissionRate;
  private double baseSalary;

  public BasePlusCommissionEmployee(
      String firstName, String lastName, String socialSecurityNumber,
      double grossSales, double commissionRate, double baseSalary) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales cannot be negative.");
    }
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      System.out.printf("Bad value: %.2f\n", commissionRate);
      throw new IllegalArgumentException("Commission rate must be on (0, 1).");
    }
    if (baseSalary < 0.0) {
      throw new IllegalArgumentException("Base salary cannot be negative.");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
    this.baseSalary = baseSalary;
  }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }

  public String getSocialSecurityNumber() { return socialSecurityNumber; }

  public void setGrossSales(double grossSales) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales cannot be negative.");
    }
    this.grossSales = grossSales;
  }

  public double getGrossSales() { return grossSales; }

  public void setCommissionRate(double commissionRate) {
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      throw new IllegalArgumentException("Commission rate must be on (0, 1).");
    }
    this.commissionRate = commissionRate;
  }

  public double getCommissionRate() { return commissionRate; }

  public void setBaseSalary(double baseSalary) {
    if (baseSalary < 0.0) {
      throw new IllegalArgumentException("Base salary cannot be negative.");
    }
  }

  public double getBaseSalary() { return baseSalary; }

  public double earnings() {
    return baseSalary + commissionRate*grossSales;
  }

  @Override
  public String toString() {
    return String.format(
      "Base-Salaried Comission Employee: %s, %s\n SSN: %s\n Gross Sales: " +
      "$%.2f\n Commision Rate: %.2f\n Base Salary: $%.2f\n",
      lastName, firstName, socialSecurityNumber, grossSales, commissionRate,
      baseSalary);
  }
}
