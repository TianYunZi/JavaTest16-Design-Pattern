package chapter.factory.factory;

import chapter.factory.shape.Shape;

public class ShapeFactory extends AbstractFactory {

    public <R> R getShape(Class<R> clazz) throws ClassNotFoundException, IllegalAccessException,
    InstantiationException {
        return (R) Class.forName(clazz.getName()).newInstance();
    }
}
