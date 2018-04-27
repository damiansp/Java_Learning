/* CreateSequentialFileTest.java */
public class CreateSequentialFileTest {
  public static void main(String[] args) {
    CreateSequentialFile app = new CreateSequentialFile();

    app.openFile();
    app.addRecords();
    app.closeFile();
  }
}
