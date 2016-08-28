/* StackComposition.java */
package dataStructures;

public class StackComposition {
  private List stackList;

  // Constr (def)
  public StackComposition() {
    stackList = new List("stack");
  }

  // push
  public void push(Object obj) {
    stackList.insertAtFront(obj);
  }

  // pop
  public Object pop() throws EmptyListException {
    return stackList.removeFromFront();
  }

  public boolean isEmpty() {
    return stackList.isEmpty();
  }

  // print
  public void print() {
    stackList.print();
  }
}
