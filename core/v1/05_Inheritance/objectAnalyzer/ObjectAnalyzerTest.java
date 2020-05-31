package objectAnalyzer;

import java.util.*;


/**
 * Use reflection to get investigate objects
 */
public class ObjectAnalyzerTest {
  public static void main(String[] args) throws ReflectiveOperationException {
    var squares = new ArrayList<Integer>();
    for (int i = 1; i <= 5; ++i) { squares.add(i * i); }
    System.out.println(new ObjectAnalyzer().toString(squares));
  }
}
