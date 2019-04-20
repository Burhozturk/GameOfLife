package sample;

import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {
    public Pane Paneone;
    Cell newCell=new Cell();

    public void MouseClick(MouseDragEvent mouseDragEvent)
    {
        newCell.setAlive(true);
        Circle newCircle=new Circle();
        newCircle.setCenterX(50);
        newCircle.setCenterY(50);
        newCircle.setRadius(10);
        newCircle.fillProperty();
        newCircle.setFill(Color.BLUE);

    }

}
