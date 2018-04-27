// Using a final instance var

public class Increment {
  private int total = 0;
  private final int INCREMENT;

  // constructor
  public Increment(int incrVal) {
    INCREMENT = incrVal;
  }

  public void addIncrementToTotal() {
    total += INCREMENT;
  }

  public String toString() {
    return String.format("total = %d", total);
  }
}
