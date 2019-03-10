import java.util.NoSuchElementException;


public class StackTest {
  public static void main(String[] args) {
    double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
    int[] intElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Stack<Double> doubleStack = new Stack<>(5);
    Stack<Integer> intStack = new Stack<>();

    testPushDouble(doubleStack, doubleElements);
    testPopDouble(doubleStack);
    testPushInt(intStack, intElements);
    testPopInt(intStack);
  }

  private static void testPushDouble(Stack<Double> stack, double[] values) {
    System.out.printf("\nPushing elements onto doubleStack\n");
    for (double value: values) {
      System.out.printf("%.1f ", value);
      stack.push(value);
    }
  }

  private static void testPopDouble(Stack<Double> stack) {
    try {
      System.out.printf("\nPopping elements from doubleStack\n");
      double popValue;

      while (true) {
        popValue = stack.pop();
        System.out.printf("%.1f ", popValue);
      }
    } catch (NoSuchElementException e) {
      System.err.println();
      e.printStackTrace();
    }
  }

  private static void testPushInt(Stack<Integer> stack, int[] values) {
    System.out.printf("\nPushing elements onto intStack\n");
    for (int value: values) {
      System.out.printf("%d ", value);
      stack.push(value);
    }
  }

  private static void testPopInt(Stack<Integer> stack) {
    try {
      System.out.printf("\nPopping elements from intStack\n");
      int popValue;

      while (true) {
        popValue = stack.pop();
        System.out.printf("%d ", popValue);
      }
    } catch (NoSuchElementException e) {
      System.err.println();
      e.printStackTrace();
    }
  }
}
