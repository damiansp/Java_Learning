class Student {
  static int nextId = 0;

  final int id;
  final String firstName, lastName;

  // Constructor
  Student(String fName, String lName) {
    id = nextId;
    nextId++;

    firstName = fName;
    lastName = lName;
  }

  String getFirstName() {
    return firstName;
  }

  String getLastName() {
    return lastName;
  }

  void registerForCourse(Course c) {
    c.registerStudent(this);
  }

  void unregisterForCourse(Course c) {
    c.unregisterStudent(this);
  }
}
