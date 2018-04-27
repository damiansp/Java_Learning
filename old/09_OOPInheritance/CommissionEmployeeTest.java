// Test CommissionEmployee class
public class CommissionEmployeeTest {
  public static void main(String[] args) {
    CommissionEmployee employee = new CommissionEmployee(
      "Sue", "Jones", "101-00-1011", 10000, 0.06);

    // get data from commission employee
    System.out.printf("%s %s\n", "First name: ", employee.getFirstName());
    System.out.printf("%s %s\n", "Last name: ", employee.getLastName());
    System.out.printf("%s %s\n", "SSN: ", employee.getSocialSecurityNumber());
    System.out.printf("%s %.2f\n", "Gross sales: ", employee.getGrossSales());
    System.out.printf(
      "%s %.2f\n", "Commission Rate: ", employee.getCommissionRate());

    employee.setGrossSales(500);
    employee.setCommissionRate(0.1);

    System.out.printf("\n%s:\n\n%s\n",
                      "Updated employee info output with toString():",
                      employee);
  }
}
