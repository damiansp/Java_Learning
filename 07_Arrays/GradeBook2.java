// Grade book using a 2D array
public class GradeBook2 {
  private String courseName;
  private int grades[][]; // students x assignments

  // Constructor
  public GradeBook2(String name, int gradeArray[][]) {
    courseName = name;
    grades = gradeArray;
  }

  // Setters & Getters
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

  // Find min/max grades
  public int getMin() {
    int worst = grades[0][0];

    for (int gr[]: grades) {
      for (int g: gr) {
        if (g < worst) {
          worst = g;
        }
      }
    }

    return worst;
  }

  public int getMax() {
    int best = grades[0][0];
    
    for (int gr[]: grades) {
      for (int g: gr) {
        if (g > best) {
          best = g;
        }
      }
    }
    
    return best;
  }

  // Calculate mean for an arbitrary set of grades
  public double getMean(int grades[]) {
    int total = 0;

    for (int g: grades) {
      total += g;
    }

    return (double) total / grades.length;
  }

  // Create a histogram of grades
  public void outputHistogram() {
    int freqs[] = new int[11];

    System.out.println("Grade distribution:");

    // Assign each grade to the appropriate freq bin
    for (int gr[]: grades) {
      for (int g: gr) {
        ++freqs[g / 10];
      }
    }

    // Print histo
    for (int i = 0; i < freqs.length; i++) {
      // Print label
      if (i == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
      }

      // print bars
      for (int j = 0; j < freqs[i]; j++) {
        System.out.print("*");
      }

      System.out.println();
    } 
  }

  // Display contents of grade array
  public void outputGrades() {
    System.out.println("The grades are:\n");
    System.out.print("            ");

    // Col headers
    for (int test = 0; test < grades[0].length; test++) {
      System.out.printf(" Test %d ", test + 1);
    }

    System.out.println("  Mean");

    for (int student = 0; student < grades.length; student++) {
      System.out.printf("Student %2d", student + 1);

      for (int test: grades[student]) {
        System.out.printf("%8d", test);
      }

      // Calculate mean for student
      double mean = getMean(grades[student]);
      System.out.printf("%9.2f\n", mean);
    }
    
  }
  
  public void processGrades() {
    outputGrades();
    System.out.printf("Grades ranged from %d to %d\n\n", getMin(), getMax());
    outputHistogram();
  }
}
