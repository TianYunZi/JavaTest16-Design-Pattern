package chapter.factory.factory;

import chapter.factory.color.Color;

public class ColorFactory extends AbstractFactory {

    public <R> R getColor(Class<R> clazz) throws ClassNotFoundException, IllegalAccessException,
    InstantiationException {
        return (R) Class.forName(clazz.getName()).newInstance();
    }
}
