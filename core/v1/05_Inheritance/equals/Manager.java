package equals;


public class Manager extends Employee {
  private double bonus;

  public Manager(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    bonus = 0;
  }

  public double getSalary() {
    double baseSalary = super.getSalary();
    return baseSalary + bonus;
  }

  public void setBonus(double bonus) { this.bonus = bonus; }

  public boolean equals(Object other) {
    if (!super.equals(other)) { return false; }
    var o = (Manager) other;
    return bonus == o.bonus;
  }

  public int hashCode() {
    return java.util.Objects.hash(super.hashCode(), bonus);
  }

  public String toString() {
    return super.toString() + "[bonus=" + bonus + "]";
  }
}
