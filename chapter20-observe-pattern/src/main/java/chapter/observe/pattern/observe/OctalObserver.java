package chapter.observe.pattern.observe;

import chapter.observe.pattern.subject.Subject;

public class OctalObserver extends Observe {

    public OctalObserver(Subject subject){
        super.subject = subject;
        super.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
