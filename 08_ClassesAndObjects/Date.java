// Date class

public class Date {
  private int month; // 1 - 12
  private int day;   // 1 - 31
  private int year;

  // Validate input to constructor
  private int checkMonth(int testMonth) {
    if (testMonth > 0 && testMonth <= 12) {
      return testMonth;
    } else {
      System.out.printf("Invalid month (%d); Set to 1.", testMonth);
      return 1;
    }
  }

  private int checkDay(int testDay) {
    int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Change if leap year
    if (year % 4 == 0 && year % 100 != 0) {
      daysPerMonth[2] = 29;
    }
    
    if (testDay > 0 && testDay <= daysPerMonth[month]) {
      return testDay;
    }

    System.out.printf("Invalid day (%d); Set to 1.", testDay);
    return 1;
      
  }
  
  // Constructor
  public Date(int theMonth, int theDay, int theYear) {
    month = checkMonth(theMonth);
    day = checkDay(theDay);
    year = theYear;

    System.out.printf("Date object constructor for date %s\n", this);
  }

  // toString
  public String toString() {
    return String.format("%d/%d/%d", month, day, year);
  }
}
