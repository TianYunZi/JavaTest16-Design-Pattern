package chapter.decorator.pattern.decorator;

import chapter.decorator.pattern.entity.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShap) {
        super(decoratedShap);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShap);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
