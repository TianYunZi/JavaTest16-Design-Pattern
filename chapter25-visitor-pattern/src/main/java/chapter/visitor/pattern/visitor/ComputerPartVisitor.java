package chapter.visitor.pattern.visitor;

import chapter.visitor.pattern.computer.Computer;
import chapter.visitor.pattern.computer.Keyboard;
import chapter.visitor.pattern.computer.Monitor;
import chapter.visitor.pattern.computer.Mouse;

public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
