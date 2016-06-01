// Use GradeBook2
public class GradeBook2Test {
  public static void main(String[] args) {
    int grades[][]= {{ 100, 36, 56 },
                     {  60, 75, 74 },
                     {  82, 73, 85 },
                     {  46, 74, 68 },
                     {  89, 90, 74 },
                     {  62,100, 67 },
                     {  69, 81, 83 },
                     {  61, 77, 39 },
                     {  95, 81,100 },
                     {  58, 83, 74 }};
    GradeBook2 javaGB = new GradeBook2("CS101 Intro to Java", grades);
    javaGB.displayWelcome();
    javaGB.processGrades();
  }
}
