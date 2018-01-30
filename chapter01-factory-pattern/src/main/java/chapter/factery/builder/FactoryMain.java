package chapter.factery.builder;

import chapter.factery.Rectangle;
import chapter.factery.Shape;

import java.lang.reflect.InvocationTargetException;

public class FactoryMain {
    public static void main(String[] args) {
        try {
            Shape shape = ShapeFactory.getShape(Rectangle.class);
            shape.draw();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
