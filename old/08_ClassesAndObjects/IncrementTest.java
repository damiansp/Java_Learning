// Test Increment Class: Final var initialized with a constructor arg
public class IncrementTest {
  public static void main(String[] args) {
    Increment value = new Increment(11);

    System.out.printf("Initialized value: %s\n\n", value);

    for (int i = 1; i <=3; i++) {
      value.addIncrementToTotal();
      System.out.printf("After increment %d: %s\n", i, value);
    }
  }
}
