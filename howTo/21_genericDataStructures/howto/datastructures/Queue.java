package howto.datastructures;

import java.util.NoSuchElementException;


public class Queue<E> {
  private List<E> queueList;

  public Queue() { queueList = new List<E>("queue"); }

  public void enqueue(E obj) { queueList.insertAtBack(obj); }

  public E dequeue() throws NoSuchElementException {
    return queueList.removeFromFront();
  }

  public boolean isEmpty() { return queueList.isEmpty(); }

  public void print() { queueList.print(); }
}
