import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;


public class SharedArrayTest2 {
  public static void main(String[] args) {
    SimpleArray2 sharedSimpleArray = new SimpleArray2(6);
    ArrayWriter2 writer1 = new ArrayWriter2(1, sharedSimpleArray);
    ArrayWriter2 writer2 = new ArrayWriter2(11, sharedSimpleArray);
    ExecutorService executorService = Executors.newCachedThreadPool();

    executorService.execute(writer1);
    executorService.execute(writer2);
    executorService.shutdown();
    try {
      boolean taskEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);

      if (taskEnded) {
        System.out.printf("\nContents of Simple Array:\n");
        System.out.println(sharedSimpleArray);
      } else {
        System.out.println("Timed out while waiting for tasks to finish.");
      }
    } catch (InterruptedException e) { e.printStackTrace(); }
  }
}
