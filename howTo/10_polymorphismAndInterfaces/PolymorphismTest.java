public class PolymorphismTest {
  public static void main(String[] args) {
    CommissionEmployee comEmployee = new CommissionEmployee(
       "Sue", "Jones", "135-79-8642", 10000, 0.06);
    BasePlusCommissionEmployee bpcEmployee = new BasePlusCommissionEmployee(
      "Bob", "Louis", "303-13-4353", 5000, 0.04, 300);
    CommissionEmployee comEmployee2 = bpcEmployee;

    System.out.printf(
      "Call CommissionEmployees's toString() with superclass refference to " +
      "superclass object:\n\n%s\n\nn",
      comEmployee.toString());
    System.out.printf(
      "Call BasePlusCommmissionEmployee's toString() with subclass reference " +
      "to subclass object:\n\n%s\n\n",
      bpcEmployee.toString());
    System.out.printf(
      "Call BasePlusCommissionEmployee's toString() with superclass " +
      "reference to subclass object:\n\n%s\n\n",
      comEmployee2.toString());          
  }
}
