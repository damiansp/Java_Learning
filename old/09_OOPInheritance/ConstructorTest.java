// Shows order in which hierarchical constructors are called
public class ConstructorTest {
  public static void main(String[] args) {
    CommissionEmployee4 emp1 = new CommissionEmployee4(
      "Bob", "Lewis", "987-65-4321", 5000, 0.04);

    System.out.println();

    BasePlusCommissionEmployee4 emp2 = new BasePlusCommissionEmployee4(
      "Lisa", "Jones", "007-13-1642", 2000, 0.06, 800);

    System.out.println();

    BasePlusCommissionEmployee4 emp3 = new BasePlusCommissionEmployee4(
      "Jimmy", "Dean", "001-10-0011", 8000, 0.15, 2000);
  }
}
