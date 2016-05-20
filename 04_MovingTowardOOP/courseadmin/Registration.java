class Registration {
  // Abbreviate output printing
  static void p(String l) {
    System.out.println(l);
  }
  
  public static void main(String[] args) {
    p("Welcome to the Course Administration Program.");
    p("---------------------------------------------");
    p("");

    p("Creating two courses...");
    Course ling101 = new Course("Intro to Linguistics");
    Course jap101 = new Course("First Year Japanese");

    p("- ling101 ID is: " + ling101.id);
    p("- ling101 name is: " + ling101.getName());
    p("- jap101 ID is: " + jap101.id);
    p("- jap101 name is: " + jap101.getName());

    p("Creating two students");
    Student s1 = new Student("Alice", "Allas");
    Student s2 = new Student("Bob", "Borderline");

    p("- s1: " + s1.getFirstName() + " " + s1.getLastName() + "; ID#" + s1.id);
    p("- s2: " + s2.getFirstName() + " " + s2.getLastName() + "; ID#" + s2.id);
    p("");

    p("Registering for courses...");
    s1.registerForCourse(ling101);
    s1.registerForCourse(jap101);
    ling101.registerStudent(s2);

    p("- " + ling101.getName() + ": " + ling101.nRegisteredStudents() +
      " students");
    p("- " + jap101.getName() + ": " + jap101.nRegisteredStudents() +
      " students");
  }
}
