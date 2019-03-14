import java.util.NoSuchElementException;


public class StackTest2 {
  public static void main(String[] args) {
    Double[] doubElements = {1.1, 2.2, 3.3, 4.4, 5.5};
    Integer[] intElements = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Stack<Double> doubStack = new Stack<>(5);
    Stack<Integer> intStack = new Stack<>();

    testPush("doubStack", doubStack, doubElements);
    testPop("doubStack", doubStack);
    testPush("intStack", intStack, intElements);
    testPop("intStack", intStack);
  }


  public static<E> void testPush(String name, Stack<E> stack, E[] elements) {
    System.out.printf("\nPushing elements onto %s\n", name);
    for (E element: elements) {
      System.out.printf("%s ", element);
      stack.push(element);
    }
  }


  public static <E> void testPop(String name, Stack<E> stack) {
    try {
      E popValue = stack.pop();

      System.out.printf("\nPopping elements from %s\n", name);
      while (true) {
        popValue = stack.pop();
        System.out.printf("%s ", popValue);
      }
    } catch (NoSuchElementException e) {
      System.out.println();
      e.printStackTrace();
    }
  }
}
