/* UsingExceptions3.java */
// Using Exception class: getMessage, printStackTrace
public class UsingExceptions3 {
  // throw exception back to method2()
  public static void method3() throws Exception {
    throw new Exception("Exception thrown in method3()");
  }
  
  // call method3; throw exceptions back to method1()
  public static void method2() throws Exception {
    method3();
  }
  
  // call method2(); throw exceptions back to main()
  public static void method1() throws Exception {
    method2();
  }
  
  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception e) {
      System.err.printf("%s\n\n", e.getMessage());
      e.printStackTrace();

      // obtain stack-trace info
      StackTraceElement[] traceElements = e.getStackTrace();

      System.out.println("\nStack trace from getStackTrace():");
      System.out.println("Class\t\t\tFile\t\t\tLine\tMethod");

      // Loop through traceElements to get exception description
      for (StackTraceElement element : traceElements) {
        System.out.printf("%s\t", element.getClassName());
        System.out.printf("%s\t", element.getFileName());
        System.out.printf("%s\t", element.getLineNumber());
        System.out.printf("%s\n", element.getMethodName());
      }
    }
  }
}
