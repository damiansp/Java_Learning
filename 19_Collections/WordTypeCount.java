/* WordTypeCount.java */
// Map class demo: counts the no. of occurrences of each word in a string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordTypeCount {
  private Map<String, Integer> map = new HashMap<String, Integer>();
  private Scanner scanner = new Scanner(System.in);

  // Create a map from user input
  private void createMap() {
    System.out.println("Enter a string:");
    String input = scanner.nextLine();

    // Create StringTokenizer for input
    StringTokenizer tokenizer = new StringTokenizer(input);

    // Process input text
    while (tokenizer.hasMoreTokens()) {
      String word = tokenizer.nextToken().toLowerCase();

      // if word in map
      if (map.containsKey(word)) {
        // get and incr count of word
        int count = map.get(word);
        map.put(word, count + 1);
      } else {
        map.put(word, 1); // add new word, init count to 1
      }
    }
  }

  // Print map
  private void displayMap() {
    Set<String> keys = map.keySet(); // get keys
    TreeSet<String> sortedKeys = new TreeSet<String>(keys); // sort

    System.out.println("Map contains:\nKey\t\tValue");

    // Generate output for each key in map
    for (String key: sortedKeys) {
      System.out.printf("%-10s%10s\n", key, map.get(key));
    }

    System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
  }
  
  // Constr
  public WordTypeCount() {
    createMap();
    displayMap();
  }


  // Main
  public static void main(String[] args) {
    new WordTypeCount();
  }
}
