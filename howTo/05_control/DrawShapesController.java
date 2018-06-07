import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawShapesController {
  @FXML private Canvas canvas;

  // Draw Rectangles
  @FXML
  void strokeRectanglesButtonPressed(ActionEvent event) {
    draw("rectangles");
  }

  // Draw Ovals
  @FXML
  void strokeOvalsButtonPressed(ActionEvent event) {
    draw("ovals");
  }

  public void draw(String choice) {
    GraphicsContext gc = canvas.getGraphicsContext2D();
    int step = 10;

    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

    // Draw 10 overlapping shapes
    for (int i = 0; i < 10; i++) {
      switch (choice) {
      case "rectangles":
        gc.strokeRect(10 + i*step, 10 + i*step, 90 + i*step, 90 + i*step);
        break;
      case "ovals":
        gc.strokeOval(10 + i*step, 10 + i*step, 90 + i*step, 90 + i*step);
        break;
      }
    }
  }
}
