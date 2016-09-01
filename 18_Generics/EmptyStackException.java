/* EmptyStackException.java */
// Indicates a stack is empty
public class EmptyStackException extends RuntimeException {
  public EmptyStackException() {
    this("Stack is empty");
  }

  public EmptyStackException(String exception) {
    super(exception);
  }
}
