/* ChainedExceptions.java */

public class ChainedExceptions {
  // throw exception back to method2()
  public static void method3() throws Exception {
    throw new Exception("Exception thrown in method3()");
  }
  
  // call method3(); throw exceptions back to method1()
  public static void method2() throws Exception {
    try {
      method3();
    } catch (Exception ex) {
      throw new Exception("Exception thrown in method2()", ex);
    }
  }
  
  // call method2(); thows excpetion back to main
  public static void method1() throws Exception {
    try {
      method2();
    } catch (Exception ex) {
      throw new Exception("Exception thrown in method1()", ex);
    }
  }
  
  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
