public class SalariedEmployee extends Employee {
  private double weeklySalary;

  public SalariedEmployee(
      String firstName, String lastName, String ssn, double weeklySalary) {
    super(firstName, lastName, ssn);
    if (isValid(weeklySalary)) { this.weeklySalary = weeklySalary; }
  }

  private boolean isValid(double salary) {
    if (salary < 0.0) {
      throw new IllegalArgumentException("Salary cannot be negative.");
    } else {
      return true;
    }
  }

  public void setWeeklySalary(double weeklySalary) {
    if (isValid(weeklySalary)) { this.weeklySalary = weeklySalary; }
  }

  public double getWeeklySalary() { return weeklySalary; }

  @Override
  public double earnings() { return getWeeklySalary(); }

  @Override
  public String toString() {
    return String.format("Salaried Employee: %s\nWeekly salary: $%,.2f\n",
                         super.toString(), getWeeklySalary());
  }
}
