// Using 'this' implicitly and explicitly to refer to members of an object

// Used to demo 'this'
class SimpleTime {
  private int hour;
  private int minute;
  private int second;

  // Constructor
  // If constructor uses param names identical to instance var names, "this"
  // is required to distinguish between them
  public SimpleTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String toUniversalString() {
    // "this" not required here to access ivars, b/c method does not have local
    // vars w the same name as ivars
    return String.format("%02d:%02d:%02d",
                         this.hour,
                         this.minute,
                         this.second);
  }
  
  public String buildString() {
    return String.format("%24s: %s\n%24s: %s",
                         "this.toUniversalString()",
                         this.toUniversalString(),
                         "toUniversalString()",
                         toUniversalString());
  }
}

public class ThisTest {
  public static void main(String[] args) {
    SimpleTime time = new SimpleTime(15, 30, 19);
    System.out.println(time.buildString());
  }
}
