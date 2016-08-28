/* EmptyListException.java */
// Class EmptyListException def
package dataStructures;

public class EmptyListException extends RuntimeException {
  // Constr (default)
  public EmptyListException() {
    this("List");
  }

  // Constr (init List name)
  public EmptyListException(String name) {
    super(name + " is empty");
  }
}
