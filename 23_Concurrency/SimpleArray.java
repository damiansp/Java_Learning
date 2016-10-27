/* SimpleArray.java */
import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray { // CAUTION: NOT THREAD SAFE!
  private static final SecureRandom rand = new SecureRandom();
  private final int[] array; // shared
  private int writeIndex = 0; // shared index of next element to write

  // Constr-- a SimpleArray of given size
  public SimpleArray(int size) {
    array = new int[size];
  }

  // Add value to shared array
  public void add(int value) {
    int position = writeIndex;

    try {
      // put thread to sleep for [0 - 499] ms
      Thread.sleep(rand.nextInt(500));
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }

    // Put value in appropriate elem
    array[position] = value;
    System.out.printf("Next write index: %d\n", writeIndex);
  }

  public String toString() {
    return Arrays.toString(array);
  }
}
