public class PayableInterfaceTest {
  public static void main(String[] args) {
    Payable[] payableObjects = new Payable[] {
      new Invoice("01234", "seat", 2, 375.00),
      new Invoice("12345", "tire", 4, 79.95),
      new SalariedEmployee("John", "Smith", "123-45-6789", 800.00),
      new SalariedEmployee("Lisa", "Barnes", "234-5t6-7890", 1200.00)
    };

    System.out.println("Invoices and Employees processed polymorphically:");
    for (Payable current: payableObjects) {
      System.out.printf("\n%s\npayment due: $%,.2f\n",
                        current.toString(),
                        current.getPaymentAmount());
    }
  }
}
