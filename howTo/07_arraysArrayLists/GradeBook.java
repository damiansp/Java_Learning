public class GradeBook {
  private String course;
  private int[] grades;

  public GradeBook(String course, int[] grades) {
    this.course = course;
    this.grades = grades;
  }


  public void setCourseName(String courseName) {
    this.course = courseName;
  }


  public String getCourseName() {
    return course;
  }


  public void processGrades() {
    outputGrades();
    System.out.printf("\nClass average: %.2f\n", getAverage());
    System.out.printf("Range: %d - %d\n", getMin(), getMax());
    outputBarChart();
  }


  public int getMin() {
    int lowest = grades[0];

    for (int grade: grades) {
      if (grade < lowest) {
        lowest = grade;
      }
    }
    return lowest;
  }


  public int getMax() {
    int highest = grades[0];

    for (int grade: grades) {
      if (grade > highest) {
        highest = grade;
      }
    }
    return highest;
  }


  public double getAverage() {
    int total = 0;

    for (int grade: grades) {
      total += grade;
    }
    return (double) total / grades.length;
  }


  public void outputBarChart() {
    int[] freq = new int[11];

    System.out.println("Grade Distribution:");
    for (int grade: grades) {
      ++freq[grade / 10];
    }
    for (int i = 0; i < freq.length; i++) {
      if (i == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", 10 * i, 10*i + 9);
      }
      for (int star = 0; star < freq[i]; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  public void outputGrades() {
    System.out.printf("The grades are:\n\n");
    for (int student = 0; student < grades.length; student++) {
      System.out.printf("Student %2d: %3d\n", student + 1, grades[student]);
    }
  }
}
