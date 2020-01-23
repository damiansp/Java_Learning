public class Constants2 {
  public static final double CM_PER_INCH = 2.54;

  public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11.0;
    System.out.printf("Paper dimensions (cm): %.2f x %.2f\n",
                      CM_PER_INCH * paperWidth,
                      CM_PER_INCH * paperHeight);
  }
}
