package chapter.bridge.pattern.shape;

import chapter.bridge.pattern.draw.DrawAPI;

public abstract class Shape {

    DrawAPI drawAPI;

    Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
