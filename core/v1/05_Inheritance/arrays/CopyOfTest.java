package arrays;

import java.lang.reflect.*;
import java.util.*;


/** Reflection to manipulate arrays */
public class CopyOfTest {
  public static void main(String[] args) {
    int[] a = {1, 3, 4};

    a = (int[]) goodCopyOf(a, 10);
    System.out.println(Arrays.toString(a));
    String[] b = {"Dom", "Hick", "Terry"};

    b = (String[]) goodCopyOf(b, 10);
    System.out.println(Arrays.toString(b));
    System.out.println("The following call well generate an exception:");
    b = (String[]) badCopyOf(b, 10);
  }


  /** 
   * Try to grow an array by allocating a new one and copying old elements
   * @param a the array to grow
   * @param newLength the new length
   * @return a larger array containing a, but as type Object[]
   */
  public static Object[] badCopyOf(Object[] a, int newLength) {
    // not useful
    var newArray = new Object[newLength];
    System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
    return newArray;                     
  }


  /**
   * Grow an array by allocating a new array of the same type and copying elements
   * @param a the array to grow. May be array of objects or primitives
   * @return a larger array that contains a
   */
  public static Object goodCopyOf(Object a, int newLength) {
    Class cl = a.getClass();

    if (!cl.isArray()) { return null; }
    Class componentType = cl.getComponentType();
    int length = Array.getLength(a);
    Object newArray = Array.newInstance(componentType, newLength);
    System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
    return newArray;
  }
}
