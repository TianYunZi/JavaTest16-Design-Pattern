package chapter.observe.pattern;

import chapter.observe.pattern.observe.BinaryObserver;
import chapter.observe.pattern.observe.HexaObserver;
import chapter.observe.pattern.observe.OctalObserver;
import chapter.observe.pattern.subject.Subject;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
