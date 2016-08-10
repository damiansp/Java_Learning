/* UsingExceptions.java */
// try... catc... finally demo
public class UsingExceptions {
  // try...catch...finally
  public static void throwException() throws Exception {
    try { // throw exception and immediately catch it
      System.out.println("Method throwException()");
      throw new Exception();
    } catch (Exception e) { // catch exception thrown in try
      System.err.println("Exception handled in method throwException()");
      throw e; // rethrow for further processing
    } finally {
      // executes regardless of try...catch events
      System.err.println("finally executed in throwException()");
    }

    // code here unreachable; exception rethrown in catch
  }

  // finally demo when no exception occurs
  public static void doesNotThrowException() {
    try { // no exception thrown
      System.out.println("Method doesNotThrowException()");
    } catch (Exception e) {
      System.err.println(e); // doesn't execute
    } finally {
      System.err.println("finally executed in doesNotThrowException()");
    }

    // This code is reachable... no pending throws
    System.out.println("End of method doesNotThrowException()");
  }

  
  public static void main(String[] args) {
    try {
      throwException();
    } catch (Exception e) { // exception thrown by throwExcetption()
      System.err.println("Exception handled in main()");
    }
    
    doesNotThrowException();
  }
}
