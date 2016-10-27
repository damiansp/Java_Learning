/* ArrayWriter.java */
// write ints to an array shared by multiple runnables
import java.lang.Runnable;

public class ArrayWriter implements Runnable {
  private final SimpleArray sharedArray;
  private final int startVal;

  // Constr
  public ArrayWriter(int val, SimpleArray array) {
    startVal = val;
    sharedArray = array;
  }

  public void run() {
    for (int i = startVal; i < startVal + 3; i++) {
      sharedArray.add(i);
    }
  }
}
