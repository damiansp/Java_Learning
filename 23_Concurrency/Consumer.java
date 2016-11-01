/* Consumer.java */
// Read 10 vals from a buffer
import java.security.SecureRandom;

public class Consumer implements Runnable {
  private static final SecureRandom rand = new SecureRandom();
  private final Buffer sharedLocation;

  // Constr
  public Consumer(Buffer location) {
    sharedLocation = location;
  }

  // Read buffers vals and sum
  public void run() {
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      // sleep 0 - 3 sec, read val from buffer and add to sum
      try {
        Thread.sleep(rand.nextInt(3000));
        sum += sharedLocation.blockingGet();
        System.out.printf("\t\t\t%2d\n", sum);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }

    System.out.printf("\n%s %d\n%s\n",
                      "Consumer read values totalling",
                      sum,
                      "Terminating...");
  }
}
