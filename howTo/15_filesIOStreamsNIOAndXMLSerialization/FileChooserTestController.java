import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;


public class FileChooserTestController {
  @FXML private BorderPane borderPane;
  @FXML private Button selectFileButton;
  @FXML private Button selectDirectoryButton;
  @FXML private TextArea textArea;

  // selectFileButton event handler
  @FXML
  private void selectFileButtonPressed(ActionEvent e) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Select File");
    fileChooser.setInitialDirectory(new File("."));

    File file = fileChooser.showOpenDialog(borderPane.getScene().getWindow());
    if (file != null) analyzePath(file.toPath());
    else textArea.setText("Select file or directory");
  }


  // selectDirectoryButton event handler
  @FXML
  private void selectDirectoryButtonPressed(ActionEvent e) {
    DirectoryChooser directoryChooser = new DirectoryChooser();
    directoryChooser.setTitle("Select Directory");
    directoryChooser.setInitialDirectory(new File("."));

    File file = directoryChooser.showDialog(borderPane.getScene().getWindow());
    if (file != null) analyzePath(file.toPath());
    else textArea.setText("Select file or directory");
  }


  public void analyzePath(Path path) {
    try {
      if (path != null && Files.exists(path)) {
        StringBuilder builer = new StringBuilder();
        builder.append(String.format("%s:\n", path.getFileName()));
        builder.append(String.format("Is%s a directory\n",
                                     Files.isDirectory(path) ? "" : " not"));
        builder.append(String.format("Is%s an absolute path\n",
                                     path.isAbsolute() ? "" : " not"));
        builder.append(String.format("Last modified: %s\n",
                                     Files.getLastModifiedTime(path)));
        builder.append(String.format("Size: %s\n", Files.size(path)));
        builder.append(String.format("Path: %s\n", path));
        builder.append(String.format("Absolute path: %s\n",
                                     path.toAbsolutePath()));
        if (Files.isDirectory(path)) {
          builder.append(String.format("\nDirectory contents:\n"));
          DirectoryStream<Path> directoryStream = Files.newDirectoryStream(
            path);
          for (Path p: directoryStream) {
            builder.append(String.format("%s\n", p));
          }
          
        }
        textArea.setText(builder.toString());
      } else textArea.setText("Path does not exist");
    } catch (IOException e) textArea.setText(e.toString());
  }
}
