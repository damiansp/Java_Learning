/* UsingExceptions2.java */
// Demo of stack unwinding

public class UsingExceptions2 {
  // throw exception NOT caught in this method
  public static void throwException() throws Exception {
    try {
      System.out.println("in throwExcpetion()");
      throw new Exception(); 
    } catch (RuntimeException runtimeE) { // catch wrong type
      System.err.println("Exception handled in throwException()");
    } finally {
      System.err.println("finally in throwException()");
    }
  }
  
  public static void main(String[] args) {
    try {
      throwException();
    } catch (Exception e) {
      System.err.println("Exception handled in main()");
    }
  }
}
