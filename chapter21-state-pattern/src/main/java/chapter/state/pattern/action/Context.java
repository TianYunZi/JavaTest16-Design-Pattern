package chapter.state.pattern.action;

import chapter.state.pattern.state.State;

public class Context {

    private State state;

    public Context() {
        this.state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
