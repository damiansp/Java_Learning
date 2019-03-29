import howto.datastructures.Queue;
import java.util.NoSuchElementException;


public class QueueTest {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<>();
    boolean continueLoop = true;

    queue.enqueue(-1);
    queue.print();
    queue.enqueue(0);
    queue.print();
    queue.enqueue(5);
    queue.print();
    while (continueLoop) {
      try {
        int removedItem = queue.dequeue();

        System.out.printf("\n%d dequeued\n", removedItem);
        queue.print();
      } catch (NoSuchElementException e) {
        continueLoop = false;
        e.printStackTrace();
      }
    }
  }
}
