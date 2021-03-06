public class InitArrayCL {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.printf("Usage: InitArrayCL <array-size> <init-val> <incr>\n");
    } else {
      int arrayLength = Integer.parseInt(args[0]);
      int[] array = new int[arrayLength];
      int initVal = Integer.parseInt(args[1]);
      int increment = Integer.parseInt(args[2]);

      for (int i = 0; i < array.length; i++) {
        array[i] = initVal + i * increment;
      }
      System.out.printf("%s%8s\n", "Index", "Value");
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%5d%8d\n", i, array[i]);
      }
    }
  }
}
