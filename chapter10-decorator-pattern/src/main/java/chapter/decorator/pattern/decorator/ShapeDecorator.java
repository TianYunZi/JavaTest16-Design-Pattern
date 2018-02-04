package chapter.decorator.pattern.decorator;

import chapter.decorator.pattern.entity.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShap;

    protected ShapeDecorator(Shape decoratedShap) {
        this.decoratedShap = decoratedShap;
    }

    @Override
    public void draw() {
        decoratedShap.draw();
    }
}
