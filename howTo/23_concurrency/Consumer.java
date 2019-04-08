import java.security.SecureRandom;


public class Consumer implements Runnable {
  private static final SecureRandom rand = new SecureRandom();
  private final Buffer sharedLocation;


  public Consumer(Buffer sharedLocation) {
    this.sharedLocation = sharedLocation;
  }


  @Override
  public void run() {
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(rand.nextInt(3000));
        sum += sharedLocation.blockingGet();
        System.out.printf("\t\t\t%2d\n", sum);
      } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
    System.out.printf(
      "\nConsumer read values totaling: %d\nTerminating Consumer\n",
      sum);
  }
}
