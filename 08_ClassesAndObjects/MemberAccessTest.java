// Private members of Time1 class are not accessible

public class MemberAccessTest {
  public static void main(String[] args) {
    Time1 time = new Time1();

    // The following all fail because each (hour, minute, second) has private
    // access in Time 1:
    /*
     * time.hour = 7;
     * time.minute = 15;
     * time.second = 30;
     */
    
  }
}
