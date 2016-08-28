/* ListTest.java */
import dataStructures.EmptyListException;
import dataStructures.List;

public class ListTest {
  public static void main(String[] args) {
    List list = new List();

    // insert ints into List
    list.insertAtFront(-1);
    list.print();
    list.insertAtFront(0);
    list.print();
    list.insertAtBack(1);
    list.print();
    list.insertAtBack(5);
    list.print();

    // Remove objs fr list; print after each
    try {
      Object rmObj = list.removeFromFront();
      System.out.printf("%s removed\n", rmObj);
      list.print();

      rmObj = list.removeFromFront();
      System.out.printf("%s removed\n", rmObj);
      list.print();

      rmObj = list.removeFromBack();
      System.out.printf("%s removed\n", rmObj);
      list.print();

      rmObj = list.removeFromBack();
      System.out.printf("%s removed\n", rmObj);
      list.print();
    } catch (EmptyListException elEx) {
      elEx.printStackTrace();
    }
  }
}
