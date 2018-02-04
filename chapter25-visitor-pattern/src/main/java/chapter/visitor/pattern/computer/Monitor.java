package chapter.visitor.pattern.computer;

import chapter.visitor.pattern.visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
