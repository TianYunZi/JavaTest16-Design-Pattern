package chapter.factory.main;

import chapter.factory.color.Blue;
import chapter.factory.factory.ColorFactory;
import chapter.factory.producer.FactoryProducer;

public class MainBuilder {
    public static void main(String[] args) {
        try {
            FactoryProducer factoryProducer = new FactoryProducer();
            ColorFactory colorFactory = factoryProducer.getFactory(ColorFactory.class);
            Blue blue = colorFactory.getColor(Blue.class);
            blue.fill();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
