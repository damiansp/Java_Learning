public interface Buffer {
  public void blockingPut(int val) throws InterruptedException;

  public int blockingGet() throws InterruptedException;
}
