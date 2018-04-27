// Test BasePlusCommisionEmployee2 class
public class BasePlusCommissionEmployee2Test {
  public static void main(String[] args) {

    BasePlusCommissionEmployee2 employee = new BasePlusCommissionEmployee2(
      "Bob", "Lewis", "367-53-0936", 5000, 0.04, 300);

    System.out.printf(
      "%s %s\n", employee.getFirstName(), employee.getLastName());
    System.out.printf("%s: %s\n",
                      "Social Security Number",
                      employee.getSocialSecurityNumber());
    System.out.printf("%s: %.2f\n", "Gross sales", employee.getGrossSales());
    System.out.printf(
      "%s: %.2f\n", "Commission rate", employee.getCommissionRate());
    System.out.printf("%s %.2f\n", "Base salary", employee.getBaseSalary());

    employee.setBaseSalary(1000);

    System.out.printf(
      "\n%s:\n\n%s\n", "Updated employee info", employee.toString());
  }
}
