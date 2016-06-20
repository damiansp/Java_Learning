// CommissionEmployee.java
// CommissionEmployee class extends Employee
public class CommissionEmployee extends Employee {
  private double grossSales; // weekly
  private double commissionRate;

  // Accessors
  public void setCommissionRate(double rate) {
    commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
  }

  public void setGrossSales(double sales) {
    grossSales = (sales < 0.0) ? 0.0 : sales;
  }

  public double getCommissionRate() { return commissionRate; }
  public double getGrossSales() { return grossSales; }
  
  // Constructor
  public CommissionEmployee(
    String first, String last, String ssn, double sales, double rate) {
    super(first, last, ssn);
    setGrossSales(sales);
    setCommissionRate(rate);
  }

  // toString
  public String toString() {
    return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                         "commission employee",
                         super.toString(),
                         "grossSales",
                         getGrossSales(),
                         "commission rate",
                         getCommissionRate());
  }



  // calculate earnings; override abstact method in Employee
  public double earnings() {
    return getCommissionRate() * getGrossSales();
  }
}
