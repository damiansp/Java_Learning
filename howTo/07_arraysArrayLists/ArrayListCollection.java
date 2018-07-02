import java.util.ArrayList;


public class ArrayListCollection {
  public static void main(String[] args) {
    //ArrayList<String> items = new ArrayList<String>();
    ArrayList<String> items = new ArrayList<>();

    items.add("red");
    items.add(0, "yellow");
    for (int i = 0; i < items.size(); i++) {
      System.out.printf(" %s", items.get(i));
    }
    display(items, "\nDisplay list contents with enhanced for:\n");
    items.add("green");
    items.add("yellow");
    display(items, "List with 2 new elements:\n");
    items.remove("yellow"); // removes 1st instance
    display(items, "Removed (1st) yellow\n");
    items.remove(1);
    display(items, "Removed item at index 1:\n");
    System.out.printf("'red' is %sin the list\n",
                      items.contains("red") ? "" : "not");
    System.out.printf("Size: %s\n", items.size());    
  }


  public static void display(ArrayList<String> items, String header) {
    System.out.printf(header);
    for (String item: items) {
      System.out.printf(" %s", item);
    }
    System.out.println();
  }
}


