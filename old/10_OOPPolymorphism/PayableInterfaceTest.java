// PayableInterfaceTest.java
// Tests the interface Payable
public class PayableInterfaceTest {
  public static void main(String[] args) {
    Payable payables[] = new Payable[4];

    // Populate array with Payable objs
    payables[0] = new Invoice("00001", "seat", 2, 375.00);
    payables[1] = new Invoice("00002", "tire", 4, 79.95);
    payables[2] = new SalariedEmployee("John", "Doe", "101-01-1001", 800.00);
    payables[3] = new SalariedEmployee(
      "Lisa", "Place", "010-10-0110", 1200.00);

    System.out.println("Invoices and Employees processed polymorphically:\n");

    // Generically process each elem in array payables
    for (Payable currentPayable : payables) {
      // Output elem and it appropriate payment amount
      System.out.printf("%s\n%s: $%,.2f\n\n",
                        currentPayable,
                        "payment due",
                        currentPayable.getPaymentAmount());
    }
  }
}
