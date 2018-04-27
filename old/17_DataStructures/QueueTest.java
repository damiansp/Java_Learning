/* QueueTest.java */
import dataStructures.EmptyListException;
import dataStructures.Queue;

public class QueueTest {
  public static void main(String[] args) {
    Queue queue = new Queue();

    // enqueue
    queue.enqueue(-1);
    queue.print();
    queue.enqueue(0);
    queue.print();
    queue.enqueue(1);
    queue.print();
    queue.enqueue(5);
    queue.print();

    // dequeue
    try {
      Object rmObj = null;

      while (true) {
        rmObj = queue.dequeue();
        System.out.printf("%s dequeued\n", rmObj);
        queue.print();
      }
    } catch (EmptyListException elEx) {
      elEx.printStackTrace();
    }
  }
}
