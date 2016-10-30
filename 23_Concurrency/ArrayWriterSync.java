/* ArrayWriterSync.java */
// write ints to an array shared by multiple runnables
import java.lang.Runnable;

public class ArrayWriterSync implements Runnable {
  private final SimpleArraySync sharedArray;
  private final int startVal;

  // Constr
  public ArrayWriterSync(int val, SimpleArraySync array) {
    startVal = val;
    sharedArray = array;
  }

  public void run() {
    for (int i = startVal; i < startVal + 3; i++) {
      sharedArray.add(i);
    }
  }
}
