package chapter.chain.pattern.logger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
