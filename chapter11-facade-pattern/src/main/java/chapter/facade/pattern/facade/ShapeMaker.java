package chapter.facade.pattern.facade;

import chapter.facade.pattern.entity.Circle;
import chapter.facade.pattern.entity.Rectangle;
import chapter.facade.pattern.entity.Shape;
import chapter.facade.pattern.entity.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
