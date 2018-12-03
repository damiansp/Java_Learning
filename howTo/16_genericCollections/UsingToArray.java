import java.util.Arrays;
import java.util.LinkedList;


public class UsingToArray {
  public static void main(String[] args) {
    String[] colors = {"black", "blue", "yellow"};
    LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

    links.addLast("red"); // K L Y R
    links.add("pink");    // K L Y R P
    links.add(3, "green"); // K L Y G R P
    links.addFirst("cyan"); // C K L Y G R P
    colors = links.toArray(new String[links.size()]);
    System.out.println("Colors: ");
    for (String color: colors) System.out.println(color);
  }
}
