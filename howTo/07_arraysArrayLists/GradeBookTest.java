public class GradeBookTest {
  public static void main(String[] args) {
    int[] gradesArray = {98, 88, 34,  9, 83, 74, 50, 98, 49, 84, 79, 89, 75, 39,
                         85, 70, 59, 73, 45, 98, 73, 40, 58, 97};
    GradeBook gradeBook = new GradeBook("Tough Cookies 101", gradesArray);

    System.out.printf("Welcome to the Grade Book for\n%s\n\n",
                      gradeBook.getCourseName());
    gradeBook.processGrades();
  }
}
