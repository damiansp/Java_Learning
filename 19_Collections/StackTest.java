/* StackTest.java */
// Demo of java Stack class
import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
  private void printStack(Stack<Number> stack) {
    if (stack.isEmpty()) {
      System.out.print("stack is empty\n\n");
    } else {
      System.out.print("stack contains: ");
      for (Number n: stack) {
        System.out.printf("%s ", n);
      }

      System.out.print("(top)\n\n");
    }
  }
  
  public StackTest() {
    Stack<Number> stack = new Stack<Number>();

    // Numbers to store in Stack
    Long longN   = 12L;
    Integer intN = 34567;
    Float floatN = 1.0F;
    Double doubN = 1234.5678;

    // Add numbers to Stack
    stack.push(longN);
    printStack(stack);
    stack.push(intN);
    printStack(stack);
    stack.push(floatN);
    printStack(stack);
    stack.push(doubN);
    printStack(stack);

    // Remove from stack
    try {
      Number rmN = null;

      while (true) {
        rmN = stack.pop();
        System.out.printf("%s popped\n", rmN);
        printStack(stack);
      }
    } catch (EmptyStackException nsEx) {
      nsEx.printStackTrace();
    }
  }


  public static void main(String[] args) {
    new StackTest();
  }
 
}
