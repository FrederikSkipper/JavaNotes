package behavioralDesignPatterns.commandPattern;

// Concrete command
public class StartCommand implements Command {
    private RobotMower robotMower;

    public StartCommand(RobotMower robotMower) {
    this.robotMower = robotMower;
    }

    public void run(){
        robotMower.Start();
    }

    public void cancel(){
        robotMower.Stop();
    }

    public void redo(){
        run();
    }

}
