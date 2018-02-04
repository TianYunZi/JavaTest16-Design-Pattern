package chapter.flyweight.pattern.main;

import chapter.flyweight.pattern.entity.Circle;
import chapter.flyweight.pattern.flyweight.ShapeFactory;

import java.util.Random;

public class FlyweightPatternDemo {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(1000);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return new Random().nextInt(100);
    }

    private static int getRandomY() {
        return new Random().nextInt(100);
    }
}
