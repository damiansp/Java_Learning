// Grade Book using arrays to store grades
public class GradeBook {
  private String courseName;
  private int[] grades;

  // Constructor
  public GradeBook(String name, int[] gradesArray) {
    courseName = name;
    grades = gradesArray;
  }

  // Setters/Getters
  public void setCourseName(String name) {
    courseName = name;
  }

  public String getCourseName() {
    return courseName;
  }


  
  // Display welcome message
  public void displayWelcome() {
    System.out.printf("Welcome to the grade book for\n%s!\n\n",
                      getCourseName());
  }

  // find minimum grade
  public int getMin() {
    int worst = grades[0];

    for (int g: grades) {
      if (g < worst) {
        worst = g;
      }
    }

    return worst;
  }

  // Find maximum grade
  public int getMax() {
    int best = grades[0];

    for (int g: grades) {
      if (g > best) {
        best = g;
      }
    }

    return best;
  }

  // Determine class average (mean)
  public double getMean() {
    int total = 0;

    for (int g: grades) {
      total += g;
    }

    return (double) total / grades.length;
  }

  // Output a simple histogram of scores
  public void outputHisto() {
    // freq of grades in 10-point increments (bins)
    int[] freqs = new int[11];
    
    System.out.println("Grade distribution:");

    // bin grades
    for (int g: grades) {
      ++freqs[g / 10];
    }

    // print
    for (int i = 0; i < freqs.length; i++) {
      // output labels "0-9, 10-19, ...
      if (i == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
      }

      // bars
      for (int v = 0; v < freqs[i]; v++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  // Output raw grades
  public void outputGrades() {
    for (int student = 0; student < grades.length; student++) {
      System.out.printf("Student %2d: %3d\n",
                        student + 1,
                        grades[student]);
    }
  }

  // Operate on data
  public void processGrades() {
    outputGrades();
    System.out.printf("\nClass mean is %.2f\n", getMean());
    System.out.printf("Scores ranged from %d to %d\n\n", getMin(), getMax());
    outputHisto();
  }

}
