import java.security.SecureRandom;


public class Producer implements Runnable {
  private static final SecureRandom rand = new SecureRandom();
  private final Buffer sharedLocation;


  public Producer(Buffer sharedLocation) {
    this.sharedLocation = sharedLocation;
  }


  @Override
  public void run() {
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(rand.nextInt(3000));
        sharedLocation.blockingPut(i);
        sum += i;
        System.out.printf("\t%2d\n", sum);
      } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
    System.out.printf("Producer done producing\nTerminating Producer\n");
  }
}
