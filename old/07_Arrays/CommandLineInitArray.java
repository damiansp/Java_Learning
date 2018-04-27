// Using command line args to initialize an array
public class CommandLineInitArray {
  public static void main(String[] args) {
    // Check no. of command line args
    if (args.length != 3) {
      System.out.println("Error: Please re-enter the entire command:\n" +
                         "array size, initial value, increment.");
    } else {
      // get array size from args
      int arrayLength = Integer.parseInt(args[0]);
      int[] array = new int[arrayLength];

      // get initial value and increment from args
      int initialValue = Integer.parseInt(args[1]);
      int increment = Integer.parseInt(args[2]);

      // Populate array
      for (int i = 0; i < array.length; i++) {
        array[i] = initialValue + increment * i;
      }

      System.out.printf("%s%8s\n", "Index", "Value");

      // Output array
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%5d%8d\n", i, array[i]);
      }
    }
  }
}
