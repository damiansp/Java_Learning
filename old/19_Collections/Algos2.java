/* Algos2.java */
// Using Collections' methods addAll, frequency, and disjoint
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Algos2 {
  private String[] colors = { "red", "yellow", "blue", "white" };
  private List<String>list = Arrays.asList(colors);
  private Vector<String> vector = new Vector<String>();

  // Constr-- create List and vector, manip w Collection methods
  public Algos2() {
    vector.add("black");
    vector.add("red");
    vector.add("green");

    System.out.println("Before addAll(), vector contains:");

    // Print vector
    for (String s: vector) {
      System.out.printf("%s ", s);
    }

    // add colors to vector
    Collections.addAll(vector, colors);
    System.out.println("\n\nAfter addAll():");

    for (String s: vector) {
      System.out.printf("%s ", s);
    }

    // Get frequency of "red"
    int redFreq = Collections.frequency(vector, "red");

    System.out.printf("\n\nFrequency of 'red' in vector: %d", redFreq);

    // Check if list and vector have common elements
    boolean disjoint = Collections.disjoint(list, vector);

    System.out.printf("\nlist and vector %s elements in common\n",
                      (disjoint ? "do not have" : "have"));
  }


  public static void main(String[] args) {
    new Algos2();
  }
}
