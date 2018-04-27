// Test Time1

public class Time1Test {
  public static void main(String[] args) {
    // Create and init Time1 obj
    Time1 time = new Time1();

    // Output String representations
    System.out.println("Initial Universal: " + time.toUniversalString());
    System.out.println("Standard: "  + time.toString() + "\n");

    // Change time and output updated value
    time.setTime(13, 23, 07);
    System.out.println("Universal after setTime(): " +
                       time.toUniversalString());
    System.out.println("Standard: " + time.toString() + "\n");
  }
}
