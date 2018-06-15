public class Scope {
  private static String x = "Class x";

  
  public static void main(String[] args) {
    String x = "Main x";

    System.out.printf("local x in main is %s\n", x);
    useLocalVariable();
    useField();
    useLocalVariable();
    useField();
   System.out.printf("\nlocal x in main is %s\n", x);
  }

  
  public static void useLocalVariable() {
    String x = "Local x";
    
    System.out.printf("\nlocal x on entering useLocalVariable(): %s\n", x);
    x += "_loc";
    System.out.printf("local x before exiting useLocalVariable(): %s\n", x);
  }

  
  public static void useField() {
    System.out.printf("\nfield x on entering useField(): %s\n", x);
    x += "_fld";
    System.out.printf("field x before exiting useField(): %s\n", x);
  }
}
