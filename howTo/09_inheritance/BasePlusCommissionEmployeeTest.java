public class BasePlusCommissionEmployeeTest {
  public static void main(String[] args) {
    BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
      "Bob", "Louis", "987-65-4321", 5000, 0.04, 300);

    System.out.printf("Employee information from methods:\n");
    System.out.printf(" Name: %s\n", employee.getFirstName());
    System.out.printf(" Surname: %s\n", employee.getLastName());
    System.out.printf(" SSN: %s\n", employee.getSocialSecurityNumber());
    System.out.printf(" Gross Sales: $%.2f\n", employee.getGrossSales());
    System.out.printf(" Commission Rate: %.2f\n", employee.getCommissionRate());
    System.out.printf(" Base Salary: $%.2f\n", employee.getBaseSalary());
    employee.setBaseSalary(1000);
    System.out.printf(
      "\n\nUpdated employee information from toString():\n%s",
      employee.toString());
  }
}
