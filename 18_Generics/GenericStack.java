/* GenericStack.java */
public class GenericStack<E> {
  private final int size;
  private int top;
  private E[] elements;

  // Constr: (def size = 10)
  public GenericStack() {
    this(10);  // how does this line know which var to initialize?
  }

  // Constr (init size)
  public GenericStack(int s) {
    size = s > 0 ? s : 0;
    top = -1; // empty at init
    elements = (E[]) new Object[size]; // why not new E[size]?
  }

  // Push elements onto stack; return true if successful
  public void push(E pushValue) {
    if (top == size - 1) {
      // Stack is full
      throw new FullStackException(String.format(
        "Stack is full.  Cannot push %s", pushValue));
    }

    elements[++top] = pushValue;
  }

  // Return top element if not empty
  public E pop() {
    if (top == -1) {
      // Stack is empty
      throw new EmptyStackException("Stack is empty. Cannot pop.");
    }

    return elements[top--];
  }
}
