package chapter.factory.producer;

import chapter.factory.factory.AbstractFactory;

public class FactoryProducer {
    public <R> R getFactory(Class<R> clazz) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        return (R) Class.forName(clazz.getName()).newInstance();
    }
}
