import java.util.concurrent.ArrayBlockingQueue;


public class BlockingBuffer implements Buffer {
  private final ArrayBlockingQueue<Integer> buffer;


  public BlockingBuffer() {
    buffer = new ArrayBlockingQueue<Integer>(1);
  }


  @Override
  public void blockingPut(int value) throws InterruptedException {
    buffer.put(value);
    System.out.printf(
      "Producer writes %2d\tBuffer cells occupied: %d\n",
      value,
      buffer.size());
  }


  @Override
  public int blockingGet() throws InterruptedException {
    int readValue = buffer.take();
    System.out.printf(
      "Consumer reads  %2d\tBuffer cells occupied: %d\n",
      readValue,
      buffer.size());
    return readValue;
  }
}
