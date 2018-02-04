package chapter.bridge.pattern.main;

import chapter.bridge.pattern.draw.GreenCircle;
import chapter.bridge.pattern.draw.RedCircle;
import chapter.bridge.pattern.shape.Circle;
import chapter.bridge.pattern.shape.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
