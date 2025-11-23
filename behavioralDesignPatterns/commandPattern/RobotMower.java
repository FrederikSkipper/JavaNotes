package behavioralDesignPatterns.commandPattern;

// Reciever class
public class RobotMower {
    public void Start() {
        System.out.println("Starting cutting session");
    }

    public void Stop() {
        System.out.println("Stopping cutting session");
    }
}
