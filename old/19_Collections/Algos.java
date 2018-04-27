/* Algos.java */
// Collection class algorithms: reverse, fill, copy, min, max demo
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algos {
  private Character[] letters = { 'P', 'C', 'M' },
    lettersCopy = new Character[3];
  private List<Character> list = Arrays.asList(letters),
    copyList = Arrays.asList(lettersCopy);

  // Output a List
  private void output(List<Character> listRef) {
    System.out.print("The list is: ");

    for (Character c: listRef) {
      System.out.printf("%s ", c);
    }

    System.out.printf("\nMax: %s\nMin: %s\n",
                      Collections.max(listRef),
                      Collections.min(listRef));
  }
  
  // Constr-- Create a List, manipulate w Collections' methods
  public Algos() {
    System.out.println("Initial list: ");
    output(list);

    Collections.reverse(list);
    System.out.println("Reverse:");
    output(list);

    Collections.copy(copyList, list);
    System.out.println("Copy:");
    output(copyList);

    Collections.fill(list, 'R');
    System.out.println("Fill:");
    output(list);
  }



  public static void main(String[] args) {
    new Algos();
  }
}
