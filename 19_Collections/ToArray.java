/* ToArray.java */
import java.util.Arrays;
import java.util.LinkedList;

public class ToArray {
  // Constr-- create LinkedList, add elems and convert to array
  public ToArray() {
    String[] colors = { "black", "blue", "yellow" };
    LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));

    links.addLast("red"); // note addLast() is exactly the same as add()
    links.add("pink");
    links.add(3, "green");
    links.addFirst("cyan");

    // Get LinkedList elems as an array
    colors = links.toArray(new String[links.size()]);

    System.out.println("colors: ");

    for (String color: colors) {
      System.out.println(color);
    }
  }


  
  public static void main(String[] args) {
    new ToArray();
  }
}
