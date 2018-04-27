// Test Time2 class

public class Time2Test {
  public static void main(String[] args) {
    Time2 t1 = new Time2();
    Time2 t2 = new Time2(1);
    Time2 t3 = new Time2(2, 34);
    Time2 t4 = new Time2(5, 6, 7);
    Time2 t5 = new Time2(13, 8, 99);
    Time2 t6 = new Time2(t4);
    
    System.out.println("Constructed with:");
    System.out.println("t1: no args passed (defaults)");
    System.out.printf("   %s\n", t1.toUniversalString());
    System.out.printf("   %s\n", t1.toString());

    System.out.println("t2: hour arg only");
    System.out.printf("   %s\n", t2.toUniversalString());
    System.out.printf("   %s\n", t2.toString());

    System.out.println("t3: hour and minute args");
    System.out.printf("   %s\n", t3.toUniversalString());
    System.out.printf("   %s\n", t3.toString());
    
    System.out.println("t4: hour, minute, and second)");
    System.out.printf("   %s\n", t4.toUniversalString());
    System.out.printf("   %s\n", t4.toString());

    System.out.println("t5: hour, minute, and invalid second");
    System.out.printf("   %s\n", t5.toUniversalString());
    System.out.printf("   %s\n", t5.toString());
    
    System.out.println("t6: passed Time2 object t4");
    System.out.printf("   %s\n", t6.toUniversalString());
    System.out.printf("   %s\n", t6.toString());
  }
}
