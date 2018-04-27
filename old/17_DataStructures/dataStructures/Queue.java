/* Queue.java */
package dataStructures;

public class Queue {
  private List queueList;

  // Constr (def)
  public Queue() {
    queueList = new List("queue");
  }

  // enqueue
  public void enqueue(Object obj) {
    queueList.insertAtBack(obj);
  }

  // dequeue
  public Object dequeue() throws EmptyListException {
    return queueList.removeFromFront();
  }

  // Empty?
  public boolean isEmpty() {
    return queueList.isEmpty();
  }

  // Print
  public void print() {
    queueList.print();
  }
}
