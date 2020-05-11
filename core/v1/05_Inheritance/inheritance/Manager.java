package inheritance;


public class Manager extends Employee {
  private double bonus;

  /**
   * @param name the employee's name
   * @param salary annual salary
   * @year year of hire
   * @month month of hire
   * @day day of hire
   */
  public Manager(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    bonus = 0;
  }

  public double getSalary() {
    double baseSalary = super.getSalary();
    return baseSalary + bonus;
  }

  public void setBonus(double b) { bonus = b; }
}
