/* PriorityQueueTest.java */
import java.util.PriorityQueue;

public class PriorityQueueTest {
  public static void main(String[] args) {
    // Queue of capacity 11
    PriorityQueue<Double> q = new PriorityQueue<Double>();

    // Insert into queue
    q.offer(3.2);
    q.offer(9.8);
    q.offer(5.4);

    System.out.println("Polling from queue: ");

    // Print elements
    while (q.size() > 0) {
      System.out.printf("%.1f ", q.peek());
      q.poll(); // rms top elem
    }
  }
}
