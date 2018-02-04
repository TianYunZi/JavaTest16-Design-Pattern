package chapter.observe.pattern.subject;

import chapter.observe.pattern.observe.Observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observe> observes = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observe observe) {
        observes.add(observe);
    }

    private void notifyAllObservers() {
        observes.forEach(Observe::update);
    }
}
