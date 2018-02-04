package chapter.visitor.pattern.computer;

import chapter.visitor.pattern.visitor.ComputerPartVisitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
