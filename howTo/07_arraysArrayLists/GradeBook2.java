public class GradeBook2 {
  private String courseName;
  private int[][] grades;

  public GradeBook(String courseName, int[][] grades) {
    this.courseName = courseName;
    this.grades = grades;
  }


  public void setCourseName(String courseName) {
    courseName = courseName;  // <- this.courseName = courseName
  }


  public String getCourseName() {
    return courseName;
  }


  public void processGrades() {
    outputGrades();
    System.out.println("\nRange of grades: %d - %d\n", getMin(), getMax());
    outputBarChart();
  }


  public int getMin() {
    int low = grades[0][0];

    for (int[] student: grades) {
      for (int grade: student) {
        if (grade < low) {
          low = grade;
        }
      }
    }
  }


  public int getMax() {
    int high = grades[0][0];

    for (int[] student: grades) {
      for (int grade: student) {
        if (grade > high) {
          high = grade;
        }
      }
    }
  }


  public double getAverage(int[] setOfGrades) {
    int total = 0;

    for (int grade: setOfGrades) {
      total += grade;
    }
    return (double) total / setOfGrades.length;
  }


  public void outputBarChart() {
    System.out.println("Grade Distribution:");
    int[] freq = new int[11];

    for (int[] student: grades) {
      for (int grade: student) {
        ++freq[grade / 10];
      }
    }
    for (int i = 0; i < freq.length; i++) {
      if (count == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", count*10, count*10 + 9);
      }
      for (int star = 0; stars < freq[count]; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  public void outputGrades() {
    System.out.printf("The grades:\n\n");
    System.out.print("          ");
    for (int test = 0; test < grades[0].length; test++) {
      System.out.printf("Test %d ", test + 1);
    }
    System.out.println("Average");
    for (int student = 0; student < grades.length; student++) {
      System.out.printf("Student %2d", student + 1);
      for (int test: grades[student]) {
        System.out.printf("%8d", test);
      }
      double average = getAverage(grades[student]);
      System.out.printf("%9.2f\n", average);
    }
  }
}
