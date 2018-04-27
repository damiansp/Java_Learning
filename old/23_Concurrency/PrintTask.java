/* PrintTask.java */
// Class sleeps for a random time between 0 and 5 seconds
import java.security.SecureRandom;

public class PrintTask implements Runnable {
  private static final SecureRandom rand = new SecureRandom();
  private final int sleepTime;
  private final String taskName;

  // Constr
  public PrintTask(String taskName) {
    this.taskName = taskName;

    // randomly set sleep time on [0, 5] s
    sleepTime = rand.nextInt(5000); // ms
  }

  // run contains code that a trhead will execute
  public void run() {
    try {
      // put thread to sleep for sleepTime ms
      System.out.printf(
        "%s going to sleep for %.3f seconds.\n", taskName, sleepTime / 1000.0);
      Thread.sleep(sleepTime);
    } catch (InterruptedException e) {
      e.printStackTrace();
      Thread.currentThread().interrupt();
    }

    // Print taskName
    System.out.printf("%s done sleeping%n", taskName);
  }
}
 
