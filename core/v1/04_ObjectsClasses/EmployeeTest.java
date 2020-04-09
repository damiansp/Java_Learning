import java.time.*;


public class EmployeeTest {
  public static void main(String[] args) {
    Employee[] staff = new Employee[3];

    staff[0] = new Employee("Curtis Cortez", 75000, 1987, 12, 15);
    staff[1] = new Employee("Doris Sadoris", 50000, 1989, 10, 1);
    staff[2] = new Employee("Eddie Isnterd", 40000, 1990, 3, 15);

    // Give all employees a 5% raise and print info
    for (Employee e: staff) {
      e.raiseSalary(5);
      System.out.println("Name: " +  e.getName()
                         + "\n  Salary: " + e.getSalary()
                         + "\n  Hired: " + e.getHireDate());
    }
  }
}


class Employee {
  private String name;
  private double salary;
  private LocalDate hireDate;

  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    hireDate = LocalDate.of(year, month, day);
  }

  public String getName() { return name; }

  public double getSalary() { return salary; }

  public LocalDate getHireDate() { return hireDate; }

  public void raiseSalary(double percent) {
    double raise = salary * percent / 100;
    salary += raise;
  }
}
