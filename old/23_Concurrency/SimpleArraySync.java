/* SimpleArraySync.java */
// Class manages an int array to be shared by mult threads w synchronization
import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArraySync {
  private static final SecureRandom rand = new SecureRandom();
  private final int[] array; // to be shared
  private int writeIndex = 0;

  // Constr
  public SimpleArraySync(int size) {
    array = new int[size];
  }

  // Add elems to the array
  public synchronized void add(int value) {
    int position = writeIndex;

    try {
      Thread.sleep(rand.nextInt(500));
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }

    // put val in appropiate elem
    array[position] = value;
    System.out.printf("%s wrote %2d to element %d.\n",
                      Thread.currentThread().getName(),
                      value,
                      position);
    ++writeIndex;
    System.out.printf("Next write index: %d\n", writeIndex);
  }

  // toString
  public synchronized String toString() {
    return Arrays.toString(array);
  }
}
