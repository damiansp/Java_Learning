// Test BasePlusCommissionEmployee3 class
public class BasePlusCommissionEmployee3Test {
  public static void main(String[] args) {
    BasePlusCommissionEmployee3 employee = new BasePlusCommissionEmployee3(
      "Bob", "Lewis", "987-65-4321", 5000, 0.04, 300);

    System.out.printf("%s %s\n", "Name:", employee.getFirstName());
    System.out.printf("%s %s\n", "Surname:", employee.getLastName());
    System.out.printf("%s %s\n", "SSN:", employee.getSocialSecurityNumber());
    System.out.printf("%s %.2f\n", "Gross Sales:", employee.getGrossSales());
    System.out.printf("%s %.2f\n", "Commission Rate:",
                      employee.getCommissionRate());
    System.out.printf("%s %.2f\n", "Base Salary:", employee.getBaseSalary());

    employee.setBaseSalary(1000);

    System.out.printf("\n%s: \n\n%s\n", "Updated info:", employee.toString());
  }
}
