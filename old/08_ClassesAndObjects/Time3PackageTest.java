// Use Time3 object import
import time.Time3;

public class Time3PackageTest {
  public static void main(String[] args) {
    Time3 birthTime = new Time3();

    birthTime.setTime(1, 23, 07);
    System.out.println("Time of birth (universal): ");
    System.out.println(birthTime.toUniversalString());
    System.out.println("(standard): ");
    System.out.println(birthTime.toString());
    System.out.println();
  }
}
