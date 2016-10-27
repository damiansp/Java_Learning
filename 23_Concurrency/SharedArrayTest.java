/* SharedArrayTest.java */
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
  public static void main(String[] args) {
    // Construct the shared object
    SimpleArray sharedArray = new SimpleArray(6);

    // Create 2 tasks to write to the shared array
    ArrayWriter w1 = new ArrayWriter(1, sharedArray);
    ArrayWriter w2 = new ArrayWriter(11, sharedArray);

    // Execute tasks w ExecutorService
    ExecutorService exServ = Executors.newCachedThreadPool();
    exServ.execute(w1);
    exServ.execute(w2);
    exServ.shutdown();

    try {
      // wait 1 minute for both executors to finish executing
      boolean tasksEnded = exServ.awaitTermination(1, TimeUnit.MINUTES);

      if (tasksEnded) {
        System.out.printf("\nContents of SimpleArray:\n");
        System.out.println(sharedArray);
      } else {
        System.out.println("Timed out while waiting for tasks to finish.");
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
