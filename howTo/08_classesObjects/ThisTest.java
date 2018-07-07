public class ThisTest {
  public static void main(String[] args) {
    SimpleTime time = new SimpleTime(15, 30, 19);
    System.out.println(time.buildString());
  }
}



class SimpleTime {
  private int hour;   // [0, 23]
  private int minute; // [0, 59]
  private int second; // [0, 59]

  // "this" reference required if constructor param same as instance var name
  public SimpleTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }


  public String buildString() {
    // "this" implicit here
    return String.format("%24s: %s\n%24s: %s",
                         "this.toUniversalString()", this.toUniversalString(),
                         "toUniversalString()", toUniversalString());
  }


  public String toUniversalString() {
    // "this" not required here (implicit)-- toUniversalString does not have
    // local vars with same name
    return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
  }
}
