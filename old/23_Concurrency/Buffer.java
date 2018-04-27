/* Buffer.java */
// Interface specifies methods called by Producer and Consumer
public interface Buffer {
  // Place int val into Buffer
  public void blockingPut(int value) throws InterruptedException;

  // Return int val from Buffer
  public int blockingGet() throws InterruptedException;
}
