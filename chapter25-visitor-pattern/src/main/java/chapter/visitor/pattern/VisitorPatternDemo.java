package chapter.visitor.pattern;

import chapter.visitor.pattern.computer.Computer;
import chapter.visitor.pattern.computer.ComputerPart;
import chapter.visitor.pattern.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
