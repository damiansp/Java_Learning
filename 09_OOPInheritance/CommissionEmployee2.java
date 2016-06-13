// CommissionEmployee2 class
public class CommissionEmployee2 {
  protected String firstName;
  protected String lastName;
  protected String socialSecurityNumber;
  protected double grossSales; // weekly
  protected double commissionRate; // [0, 1] (= 0 - 100%)

  // Accessors
  public void setFirstName(String first) {
    firstName = first;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String last) {
    lastName = last;
  }

  public String getLastName() {
    return lastName;
  }

  public void setSocialSecurityNumber(String ssn) {
    socialSecurityNumber = ssn;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setGrossSales(double sales) {
    grossSales = (sales < 0.0) ? 0.0 : sales;
  }

  public double getGrossSales() {
    return grossSales;
  }

  public void setCommissionRate(double rate) {
    commissionRate = (rate >= 0.0 && rate <= 1.0) ? rate : 0.0;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  

  
  // Constructor
  public CommissionEmployee2(
    String first, String last, String ssn, double sales, double rate) {
    // implicit call to Object constructor made here
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
    setGrossSales(sales);
    setCommissionRate(rate);
  }



  // toString
  public String toString() {
    return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                         "Commission employee", firstName, lastName,
                         "Social Security Number", socialSecurityNumber,
                         "Gross sales", grossSales,
                         "Commision Rate", commissionRate);
  }

  // Calculate earnings
  public double earnings() {
    return commissionRate * grossSales;
  }
}
