package behavioralDesignPatterns.commandPattern;

// Invoker class
public class MowerApp {
    public void execute(Command command) {
        command.run();
    }
}
