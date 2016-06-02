// Time2 using overloaded constructors

public class Time2 {
  private int hour;
  private int minute;
  private int second;


  // Setters/Getters
  public void setHour(int h) {
    // validate
    hour = ((h >= 0 && h < 24) ? h : 0);
  }

  public void setMinute(int m) {
    minute = ((m >= 0 && m < 60) ? m : 0);
  }

  public void setSecond(int s) {
    second = ((s >= 0 && s < 60) ? s : 0);
  }
  
  public void setTime(int h, int m, int s) {
    setHour(h);
    setMinute(m);
    setSecond(s);
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }


  
  //Constructors
  public Time2() {
    this(0, 0, 0);
  }

  public Time2(int h) {
    this(h, 0, 0);
  }

  public Time2(int h, int m) {
    this(h, m, 0);
  }

  public Time2(int h, int m, int s) {
    setTime(h, m, s);
  }

  public Time2(Time2 time) {
    this(time.getHour(), time.getMinute(), time.getSecond());
  }



  //  toStrings
  public String toUniversalString() {
    return String.format(
      "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
  }

  public String toString() {
    return String.format(
      "%d:%02d:%02d %s",
      ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
      getMinute(),
      getSecond(),
      (getHour() < 12 ? "A.M." : "P.M."));
  }
}
