/* StackTest.java */
public class StackTest {
  private double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
  private int[] intElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
  private GenericStack<Double> doubleStack = new GenericStack<Double>(5);
  private GenericStack<Integer> intStack = new GenericStack<Integer>(10);

  // Test push: double
  public void testPushDouble() {
    try {
      System.out.println("\nPushing elements onto doubleStack");

      for (double elem: doubleElements) {
        System.out.printf("%.1f ", elem);
        doubleStack.push(elem);
      }
    } catch (FullStackException fsEx) {
      System.err.println();
      fsEx.printStackTrace();
    }
  }

  // Test pop: double
  public void testPopDouble() {
    try {
      System.out.println("\nPopping elements from doubleStack");
      double popVal;

      // pop all
      while (true) {
        popVal = doubleStack.pop();
        System.out.printf("%.1f ", popVal);
      }
    } catch (EmptyStackException esEx) {
      System.err.println();
      esEx.printStackTrace();
    }
  }

  // Test push: int
  public void testPushInt() {
    try {
      System.out.println("\nPushing elements onto intStack");

      for (int elem: intElements) {
        System.out.printf("%d ", elem);
        intStack.push(elem);
      }
    } catch (FullStackException fsEx) {
      System.err.println();
      fsEx.printStackTrace();
    }
  }

  // Test pop: int
  public void testPopInt() {
    try {
      System.out.println("\nPopping elements from intStack");
      int popVal;

      // pop all
      while (true) {
        popVal = intStack.pop();
        System.out.printf("%d ", popVal);
      }
    } catch (EmptyStackException esEx) {
      System.err.println();
      esEx.printStackTrace();
    }
  }
  
  public void testStacks() {
    testPushDouble();
    testPopDouble();
    testPushInt();
    testPopInt();
  }



  public static void main(String[] args) {
    StackTest app = new StackTest();
    app.testStacks();
  }
}
