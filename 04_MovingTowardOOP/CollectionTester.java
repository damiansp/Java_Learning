import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class CollectionTester {
  public static void main(String[] args) {
    ArrayList<String> listOfStrings = new ArrayList<String>();
    listOfStrings.add("first item");
    listOfStrings.add("second item");
    listOfStrings.add("third item");
    listOfStrings.add("fourth item");
    listOfStrings.remove(0);

    HashSet<Integer> setOfIntegers = new HashSet<Integer>();
    setOfIntegers.add(2);
    setOfIntegers.add(4);
    setOfIntegers.add(2);
    setOfIntegers.remove(2);

    HashMap<String, Integer> mapOfStringToInt = new HashMap<String, Integer>();
    mapOfStringToInt.put("Alice", 4);
    mapOfStringToInt.put("Bob", 3);
    mapOfStringToInt.remove("Alice");
  }
}
