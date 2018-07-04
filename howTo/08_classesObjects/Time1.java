public class Time1 {
  private int hour;   // 0 - 23
  private int minute; // 0 - 59
  private int second; // 0 - 59


  public void setTime(int hour, int minute, int second) {
    if (hour < 0 || hour > 23
        || minute < 0 || minute > 59
        || second < 0 || second > 59) {
      throw new IllegalArgumentException(
        "hour, minute, and/or second out of range");
    }
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }


  public String toUniversalString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }


  public String toString() {
    return String.format("%d:%02d:%02d %s",
                         ((hour == 0 || hour == 12) ? 12 : hour % 12),
                         minute,
                         second,
                         (hour < 12 ? "AM" : "PM"));
  }
}
