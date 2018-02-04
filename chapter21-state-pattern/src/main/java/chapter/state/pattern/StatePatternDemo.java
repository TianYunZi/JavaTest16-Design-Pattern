package chapter.state.pattern;

import chapter.state.pattern.action.Context;
import chapter.state.pattern.state.StartState;
import chapter.state.pattern.state.StopState;

public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
