// Assigning superclass and subclass refs to superclass and subclass vars

public class PolymorphismTest {
  public static void main(String[] args) {
    // Assign superclass ref to superclass var
    CommissionEmployee4 comEmp = new CommissionEmployee4(
      "Jack", "Daniels", "666-55-6565", 10000, 0.06);

    // Assign subclass ref to subclass var
    BasePlusCommissionEmployee4 bcomEmp = new BasePlusCommissionEmployee4(
      "Jonathan", "Walker", "001-31-1867", 5000, 0.04, 300);

    // Invoke toString on superclass obj using superclass var
    System.out.printf(
      "%s:\n\n%s\n\n",
      "Call BasePlusCommissionEmployee4's toString() with superclass reference " +
      "to superclass object",
      comEmp.toString());

    // Invoke toString on subclass onj using subclass var
    System.out.printf(
      "%s:\n\n%s\n\n",
      "Call BasePlusCommissionEmployee4's toString() with subcalass reference " +
      "to subclass object",
      bcomEmp.toString());

    // Invoke toString on subclass using superclass var
    CommissionEmployee4 comEmp2 = bcomEmp;
    System.out.printf(
      "%s:\n\n%s\n\n",
      "Call BasePlusCommisionEmployee4's toString() with superclass reference " +
      "to subclass object",
      comEmp2.toString());
  }
}
