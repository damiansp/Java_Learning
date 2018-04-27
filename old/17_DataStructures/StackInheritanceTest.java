/* StackInheritanceTest.java */
import dataStructures.EmptyListException;
import dataStructures.StackInheritance;

public class StackInheritanceTest {
  public static void main(String[] args) {
    StackInheritance stack = new StackInheritance();

    // Push
    stack.push(-1);
    stack.print();
    stack.push(0);
    stack.print();
    stack.push(1);
    stack.print();
    stack.push(5);
    stack.print();

    // Pop
    try {
      Object rmObj = null;

      while (true) {
        rmObj = stack.pop();
        System.out.printf("%s popped\n", rmObj);
        stack.print();
      }
    } catch (EmptyListException elEx) {
      elEx.printStackTrace();
    }
  }
}
