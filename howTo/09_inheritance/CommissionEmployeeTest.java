public class CommissionEmployeeTest {
  public static void main(String[] args) {
    CommissionEmployee sue = new CommissionEmployee(
      "Sue", "Jones", "123-45-6789", 10000, 0.06);

    System.out.println("Employee information obtained by get methods:");
    System.out.printf("\nFirst name: %s\n", sue.getFirstName());
    System.out.printf("Last name: %s\n", sue.getLastName());
    System.out.printf("SSN: %s\n", sue.getSocialSecurityNumber());
    System.out.printf("Gross sales: %.2f\n", sue.getGrossSales());
    System.out.printf("Commission rate: %.2f\n", sue.getCommissionRate());
    sue.setGrossSales(5000);
    sue.setCommissionRate(0.1);
    System.out.printf("\nUpdated employee info obtained with toString:\n%s\n",
                      sue);
  }
}
