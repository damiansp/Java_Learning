/* RawTypeTest.java */
public class RawTypeTest {
  private Double[] doubElems = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
  private Integer[] intElems = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

  // Generic push
  public <T> void testPush(String name, GenericStack<T> stack, T[] elems) {
    try {
      System.out.printf("\nPushing elements onto %s\n", name);

      for (T elem: elems) {
        System.out.printf("%s ", elem);
        stack.push(elem);
      }
    } catch (FullStackException fsEx) {
      fsEx.printStackTrace();
    }
  }

  // Generic pop
  public <T> void testPop(String name, GenericStack<T> stack) {
    try {
      System.out.printf("\nPopping elements from %s\n", name);
      T popVal;

      while (true) {
        popVal = stack.pop();
        System.out.printf("%s ", popVal);
      }
    } catch (EmptyStackException esEx) {
      esEx.printStackTrace();
    }
  }
  
  
  // Test Stacks with raw types
  public void testStacks() {
    // Stack of raw, Doub, and Int types
    GenericStack raw1 = new GenericStack(5),
      raw2 = new GenericStack<Double>(5);
    GenericStack<Integer> intStack = new GenericStack(10);

    testPush("raw1", raw1, doubElems);
    testPop("raw1", raw1);
    testPush("raw2", raw2, doubElems);
    testPop("raw2", raw2);
    testPush("intStack", intStack, intElems);
    testPop("intStack", intStack);
  }



  public static void main(String[] args) {
    RawTypeTest app = new RawTypeTest();
    app.testStacks();
  }
}
