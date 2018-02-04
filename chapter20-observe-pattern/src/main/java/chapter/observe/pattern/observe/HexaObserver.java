package chapter.observe.pattern.observe;

import chapter.observe.pattern.subject.Subject;

public class HexaObserver extends Observe {

    public HexaObserver(Subject subject){
        super.subject = subject;
        super.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
