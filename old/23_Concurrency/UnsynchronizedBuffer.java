/* UnsynchronizedBuffer.java */
// Maintains the shared int that is accessed by producer and consumer threads

public class UnsynchronizedBuffer implements Buffer {
  private int buffer = -1; // shared by consumer and producer threads

  // Place val into buffer
  public void blockingPut(int value) throws InterruptedException {
    System.out.printf("Producer writes\t%2d", value);
    buffer = value;
  }

  // Return val from buffer
  public int blockingGet() throws InterruptedException {
    System.out.printf("Consumer reads\t%2d", buffer);
    return buffer;
  }
}
