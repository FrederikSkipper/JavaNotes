package behavioralDesignPatterns.commandPattern;

// Command interface
public interface Command {
    void run();
    void cancel();
    void redo();
}
