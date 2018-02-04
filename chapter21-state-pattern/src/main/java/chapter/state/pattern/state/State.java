package chapter.state.pattern.state;

import chapter.state.pattern.action.Context;

public interface State {

    void doAction(Context context);
}
