public class HourlyEmployee extends Employee {
  private double wage;
  private double hours;

  public HourlyEmployee(
      String firstName, String lastName, String ssn, double wage, double hours)
  {
    super(firstName, lastName, ssn);
    if (isValidWage(wage)) { this.wage = wage; }
    if (isValidHours(hours)) { this.hours = hours; }
  }

  private boolean isValidWage(double wage) {
    if (wage < 0.0) {
      throw new IllegalArgumentException("Wage cannot be negative.");
    } else {
      return true;
    }
  }

  private boolean isValidHours(double hours) {
    if (hours < 0.0 || hours > 168.0) {
      throw new IllegalArgumentException(
        "Weekly hours must be between 0 and 168");
    } else {
      return true;
    }
  }

  public void setWage(double wage) {
    if (isValidWage(wage)) { this.wage = wage; }
  }

  public void setHours(double hours) {
    if (isValidHours(hours)) { this.hours = hours; }
  }

  public double getWage() { return wage; }
  public double getHours() { return hours; }

  @Override
  public double earnings() {
    if (getHours() <= 40) { return getWage() * getHours() }
    else { return 40 * getWage() + (getHours() - 40) * getWage() * 1.5; }
  }

  @Override
  public String toString() {
    return String.format(
      "Hourly Employee: %s\nHourly wage: $%,.2f\nHours worked: %,.2f",
      super.toString(), getWage(), getHours());
  }
}
