package chapter.interpreter.pattern.expression;

public class TerminalExpression implements Expression {

    private String date;

    public TerminalExpression(String date) {
        this.date = date;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(date);
    }
}
