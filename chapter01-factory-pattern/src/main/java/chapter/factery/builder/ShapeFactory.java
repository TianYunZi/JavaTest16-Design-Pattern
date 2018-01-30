package chapter.factery.builder;

import chapter.factery.Shape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {

    public static Shape getShape(Class<? extends Shape> shapeClass) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        return shapeClass.newInstance();
    }
}
