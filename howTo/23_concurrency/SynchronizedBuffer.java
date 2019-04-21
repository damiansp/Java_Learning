import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SynchronizedBuffer implements Buffer {
  private final Lock accessLock = new ReentrantLock();
  private final Condition canWrite = accessLock.newCondition();
  private final Condition canRead = accessLock.newCondition();
  private int buffer = -1;
  private boolean occupied = false;


  @Override
  public synchronized void blockingPut(int value) throws InterruptedException {
    accessLock.lock();
    try {
      while (occupied) {
        System.out.println("Producer tries to write.");
        displayState("Buffer full. Producer waits.");
        canWrite.await();
      }
      buffer = value;
      occupied = true;
      displayState("Producer writes " + buffer);
      canRead.signalAll();
    } finally { accessLock.unlock(); }
  }


  @Override
  public synchronized int blockingGet() throws InterruptedException {
    int readValue = 0;

    accessLock.lock();
    try {
      while (!occupied) {
        System.out.println("Consumer tries to read.");
        displayState("Buffer empty. Consumer waits.");
        canRead.await();
      }
      occupied = false;
      readValue = buffer;
      displayState("Consumer reads " + buffer);
      canWrite.signalAll();
    } finally { accessLock.unlock(); }
    return readValue;
  }


  private void displayState(String operation) {
    try {
      accessLock.lock();
      System.out.printf("%-40s%d\t\t%b\n\n", operation, buffer, occupied);
    } finally { accessLock.unlock(); }
  }
}
