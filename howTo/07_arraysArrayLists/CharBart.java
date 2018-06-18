public class CharBart {
  public static void main(String[] args) {
    int[] array = {1, 2, 2, 4, 2, 8, 4, 32, 28, 20, 18};

    for (int i = 0; i < array.length; i++) {
      if (i == 10) {
        System.out.printf("%5d: " , 100);
      } else {
        System.out.printf("%02d-%02d: ", 10*i, 10*i + 9);
      }
      for (int stars = 0; stars < array[i]; stars++) {
        System.out.printf("*");
      }
      System.out.println();
    }
  }
}
