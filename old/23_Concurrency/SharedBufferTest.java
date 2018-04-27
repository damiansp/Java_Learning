/* SharedBufferTest.java */
// App w 2 threads manipulating an unsynchronized buffer
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
  public static void main(String[] args) throws InterruptedException {
    // Create new thread pools with 2 threads
    ExecutorService exServ = Executors.newCachedThreadPool();

    // Create UnsynchronizedBuffer to store ints
    Buffer shared = new UnsynchronizedBuffer();

    System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");

    // Execute the Producer and Consumer- give each access to shared
    exServ.execute(new Producer(shared));
    exServ.execute(new Consumer(shared));

    exServ.shutdown();
    exServ.awaitTermination(1, TimeUnit.MINUTES);
  }
}
