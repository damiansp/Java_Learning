/* StackTest2.java */
public class StackTest2 {
  private Double[] doubElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
  private Integer[] intElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
  private GenericStack<Double> doubStack = new GenericStack<Double>(5);
  private GenericStack<Integer> intStack = new GenericStack<Integer>(10);

  // Generic push
  public <T> void testPush(String name, GenericStack<T> stack, T[] elems) {
    System.out.printf("\nPushing elements onto %s\n", name);

    for (T elem: elems) {
      try {
        System.out.printf("%s ", elem);
        stack.push(elem);
      } catch (FullStackException fsEx) {
        System.out.println();
        fsEx.printStackTrace();
      }
    }
  }

  // Generic pop
  public <T> void testPop(String name, GenericStack<T> stack) {
    try {
      T popVal;

      System.out.printf("\nPopping elements from %s\n", name);

      while (true) {
        popVal = stack.pop();
        System.out.printf("%s ", popVal);
      }
    } catch (EmptyStackException esEx) {
      System.out.println();
      esEx.printStackTrace();
    }
  }
  
  public void testStacks() {
    testPush("doubStack", doubStack, doubElements);
    testPop("doubStack", doubStack);
    testPush("intStack", intStack, intElements);
    testPop("intStack", intStack);
  }



  public static void main(String[] args) {
    StackTest2 app = new StackTest2();
    app.testStacks();
  }
}
