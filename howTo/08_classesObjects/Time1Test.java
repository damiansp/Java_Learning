public class Time1Test {
  public static void main(String[] args) {
    Time1 time = new Time1();

    displayTime("After time object created", time);
    System.out.println();
    time.setTime(13, 23, 33);
    displayTime("After calling setTime", time);
    System.out.println();

    // Try invalid time
    try {
      time.setTime(99, 99, 99);
    } catch (IllegalArgumentException e) {
      System.out.printf("Exception: %s\n\n", e.getMessage());
    }

    displayTime("After attempting setTime with invalid values", time);
  }


  private static void displayTime(String header, Time1 time) {
    System.out.printf("%s\nUniversal time: %s\nStandard time: %s\n",
                      header,
                      time.toUniversalString(),
                      time.toString());
  }
}
