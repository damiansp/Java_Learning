import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Algorithms {
  public static void main(String[] args) {
    Character[] letters = {'P', 'C', 'M'};
    List<Character> list = Arrays.asList(letters);

    System.out.println("list contains: ");
    output(list);
    Collections.reverse(list);
    System.out.printf("\nAfter reverse():\n");
    output(list);

    Character[] lettersCopy = new Character[3];
    List<Character> copyList = Arrays.asList(lettersCopy);

    Collections.copy(copyList, list); // .copy(to, from)
    System.out.printf("\nAfter copy():\n");
    output(copyList);
    Collections.fill(list, 'R');
    System.out.printf("\nAfter fill():\n");
    output(list);
  }

  private static void output(List<Character> listRef) {
    System.out.print("The list is: ");
    for (Character c: listRef) {
      System.out.printf("%s ", c);
    }
    System.out.printf("\n Max: %s\n Min: %s\n",
                      Collections.max(listRef),
                      Collections.min(listRef));
  }
}
