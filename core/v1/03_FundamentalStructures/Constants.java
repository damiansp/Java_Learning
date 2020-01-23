public class Constants {
  public static void main(String[] args) {
    final double CM_PER_INCH = 2.54;
    double paperWidth = 8.5;
    double paperHeight = 11.0;
    System.out.printf("Paper dimensions (cm): %.2f x %.2f\n",
                      CM_PER_INCH * paperWidth,
                      CM_PER_INCH * paperHeight);
  }
}
