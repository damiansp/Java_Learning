/* Producer.java */
// inserts values 1 - 10 into a buffer
import java.security.SecureRandom;

public class Producer implements Runnable {
  private static final SecureRandom rand = new SecureRandom();
  private final Buffer sharedLocation;

  // Constr
  public Producer(Buffer sharedLocation) {
    this.sharedLocation = sharedLocation;
  }

  // Store valse 1 - 10 in sharedLocation
  public void run() {
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      try {
        // sleep 0 - 3 seconds, then place val in buffer
        Thread.sleep(rand.nextInt(3000));
        sharedLocation.blockingPut(i);
        sum += i;
        System.out.printf("\t%2d\n", sum);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    System.out.printf("Producer done producing\nTerminating...");
  }
}
