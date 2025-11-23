package behavioralDesignPatterns.commandPattern;

// Concrete command
public class StopCommand implements Command {
    private RobotMower robotMower;

    public StopCommand(RobotMower robotMower) {
    this.robotMower = robotMower;
    }


    public void run(){
        robotMower.Stop();
    }

    public void cancel(){
        robotMower.Start();
    }

    public void redo(){
        run();
    }

}
