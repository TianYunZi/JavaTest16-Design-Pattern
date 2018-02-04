package chapter.observe.pattern.observe;

import chapter.observe.pattern.subject.Subject;

public class BinaryObserver extends Observe {

    public BinaryObserver(Subject subject) {
        super.subject = subject;
        super.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
