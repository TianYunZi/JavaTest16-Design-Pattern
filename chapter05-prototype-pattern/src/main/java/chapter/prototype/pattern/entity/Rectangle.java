package chapter.prototype.pattern.entity;

public class Rectangle extends Shape {
    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
