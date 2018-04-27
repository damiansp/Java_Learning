/* StackInheritance.java */
package dataStructures;

public class StackInheritance extends List {
  // Constr
  public StackInheritance() {
    super("stack");
  }

  // Add obj to stack
  public void push(Object obj) {
    insertAtFront(obj);
  }

  // Remove obj from stack
  public Object pop() throws EmptyListException {
    return removeFromFront();
  }
}
