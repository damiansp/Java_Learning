package equals;

import java.time.*;
import java.util.Objects;


public class Employee {
  private String name;
  private double salary;
  private LocalDate hireDay;

  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    hireDay = LocalDate.of(year, month, day);
  }

  public String getName() { return name; }

  public double getSalary() { return salary; }

  public LocalDate getHireDay() { return hireDay; }

  public void raiseSalary(double percent) {
    double raise = salary * percent / 100;
    salary += raise;
  }

  public boolean equals(Object other) {
    if (this == other) { return true; } // same place in memory
    if (other == null) { return false; }
    if (getClass() != other.getClass()) { return false; }
    // other must be a non-null Employee
    var o = (Employee) other;
    return (Objects.equals(name, o.name)
            && salary == o.salary
            && Objects.equals(hireDay, o.hireDay));
  }

  public int hashCode() { return Objects.hash(name, salary, hireDay); }

  public String toString() {
    return getClass().getName()
      + "[name=" + name
      + ", salary=" + salary
      + ", hireDay=" + hireDay
      + "]";
  }
}
