package chapter.decorator.pattern.main;

import chapter.decorator.pattern.decorator.RedShapeDecorator;
import chapter.decorator.pattern.entity.Circle;
import chapter.decorator.pattern.entity.Rectangle;
import chapter.decorator.pattern.entity.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
