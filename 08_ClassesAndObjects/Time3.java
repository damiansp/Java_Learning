// Maintain time in 24-hour format
//package time;

public class Time3 {
  private int hour; // 0 - 23
  private int minute; // 0 - 59
  private int second; // 0 - 59

  // Set a new time value using universal time; 0 if invalid input
  public void setTime(int h, int m, int s) {
    hour   = ((h >= 0 && h < 24) ? h : 0);
    minute = ((m >= 0 && m < 60) ? m : 0);
    second = ((s >= 0 && s < 60) ? s : 0);
  }

  // Convert to String in universat time format (HH:MM:SS)
  public String toUniversalString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  // Convert to String in standard time format (H:MM:SS (AM|PM))
  public String toString() {
    return String.format("%d:%02d:%02d %s",
                         ((hour == 0 || hour == 12) ? 12 : hour % 12),
                         minute,
                         second,
                         (hour < 12 ? "A.M." : "P.M."));
  }
}
