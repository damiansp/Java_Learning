/* TaskExecutor.java */
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {
  public static void main(String[] args) {
    PrintTask t1 = new PrintTask("Task1");
    PrintTask t2 = new PrintTask("Task2");
    PrintTask t3 = new PrintTask("Task3");
    PrintTask t4 = new PrintTask("Task4");
    PrintTask t5 = new PrintTask("Task5");

    System.out.println("Starting Executor");

    ExecutorService exServ = Executors.newCachedThreadPool();

    // Start tasks
    exServ.execute(t1);
    exServ.execute(t2);
    exServ.execute(t3);
    exServ.execute(t4);
    exServ.execute(t5);

    // Shut down ExecutorService-- it decides when to shut down threads
    exServ.shutdown();

    System.out.printf("Tasks started, main ends.\n\n");
  }
}
