public class CircularBuffer implements Buffer {
  private final int[] buffer = {-1, -1, -1};
  private int occupiedCells = 0;
  private int writeIndex = 0;
  private int readIndex = 0;


  @Override
  public synchronized void blockingPut(int value) throws InterruptedException {
    while (occupiedCells == buffer.length) {
      System.out.printf("Buffer is full. Producer waiting...\n");
      wait();
    }
    buffer[writeIndex] = value;
    writeIndex = (writeIndex + 1) % buffer.length;
    ++occupiedCells;
    displayState("Producer writing " + value);
    notifyAll();
  }


  @Override
  public synchronized int blockingGet() throws InterruptedException {
    while (occupiedCells == 0) {
      System.out.printf("Buffer is empty. Consumer waiting...\n");
      wait();
    }
    int readValue = buffer[readIndex];

    --occupiedCells;
    displayState("Consumer reading " + readValue);
    notifyAll();
    return readValue;
  }


  public synchronized void displayState(String operation) {
    System.out.printf("%s (buffer cells occupied: %d)\nbuffer cells:  ",
                      operation,
                      occupiedCells);
    for (int value: buffer) { System.out.printf(" %2d  ", value); }
    System.out.printf("\n               ");
    for (int i = 0; i < buffer.length; i++) { System.out.printf("---- "); }
    System.out.printf("\n               ");
    for (int i = 0; i < buffer.length; i++) {
      if (i == writeIndex && i == readIndex) { System.out.printf(" WR"); }
      else if (i == writeIndex) { System.out.printf(" W  "); }
      else if (i == readIndex) { System.out.printf("  R "); }
      else { System.out.printf("  "); }
    }
    System.out.printf("\n\n");
  }
}
