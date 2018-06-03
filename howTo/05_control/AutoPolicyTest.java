public class AutoPolicyTest {
  public static void main(String[] args) {
    AutoPolicy policy1 = new AutoPolicy(11111, "Toyota Prius", "OR");
    AutoPolicy policy2 = new AutoPolicy(22222, "Ford Focus", "NJ");

    policyInNoFaultState(policy1);
    policyInNoFaultState(policy2);
  }

  public static void policyInNoFaultState(AutoPolicy policy) {
    System.out.println("The auto policy:");
    System.out.printf(
      "Account #: %d Car: %s;\nState %s is%s a no-fault state\n\n",
      policy.getAccountNumber(),
      policy.getMakeAndModel(),
      policy.getState(),
      (policy.isNoFaultState() ? "" : " not"));
  }
}
