import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionTest {
  public static void main(String[] args) {
    String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
    List<String> list = new ArrayList<String>();
    String[] removeColors = {"RED", "WHITE", "BLUE"};
    List<String> removeList = new ArrayList<String>();

    for (String color: colors) list.add(color);
    for (String color: removeColors) removeList.add(color);

    System.out.println("ArrayList: ");
    for (int i = 0; i < list.size(); i++) System.out.printf("%s ", list.get(i));
    removeColors(list, removeList);
    System.out.printf("\n\nArrayList after removeColors():\n");
    for (String color: list) System.out.printf("%s ", color);
    System.out.println();
  }

  private static void removeColors(
      Collection<String> coll1, Collection<String> coll2) {
    Iterator<String> iter = coll1.iterator();

    while (iter.hasNext()) {
      if (coll2.contains(iter.next())) iter.remove(); // removes current
    }
  }
}
