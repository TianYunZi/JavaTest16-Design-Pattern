package chapter.observe.pattern.observe;

import chapter.observe.pattern.subject.Subject;

public abstract class Observe {
    protected Subject subject;

    public abstract void update();
}
