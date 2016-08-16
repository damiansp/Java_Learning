/* FileDemo.java */
import java.io.File;

public class FileDemo {
  public void analyzePath(String path) {
    // Create File obj base on user input
    File name = new File(path);

    if (name.exists()) {
      // Output info abt File
      // File/directory info
      System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                        name.getName(), " exists",
                        (name.isFile() ? "is a file" : "is not a file"),
                        (name.isDirectory() ?
                         "is a directory" :
                         "is not a directory"),
                        (name.isAbsolute() ?
                         "is absolute path" :
                         "is not absolutePath"),
                        "Last Modified: ", name.lastModified(),
                        "Length: ", name.length(),
                        "Path: ", name.getPath(),
                        "Absolute Path: ", name.getAbsolutePath(),
                        "Parent: ", name.getParent());

      if (name.isDirectory()) {
        // Output dir listing
        String[] directory = name.list();

        System.out.println("\n\nDirectory contents:\n");

        for (String dirName : directory) {
          System.out.printf("%s\n", dirName);
        }
      } 
    } else {
      // Not file or dir; output err msg
      System.out.printf("%s %s", path, "does not exist\n");
    }
  }
}
