package behavioralDesignPatterns.commandPattern;

public class Main {
    public static void main(String[] args) {
        // Create reciever instance 
        RobotMower robotMower = new RobotMower();

        // Create concrete command instances of the reciever. 
        Command startCommand = new StartCommand(robotMower);
        Command stopCommand = new StopCommand(robotMower);  

        MowerApp mowerApp = new MowerApp();
        mowerApp.execute(startCommand);
        mowerApp.execute(stopCommand);
        mowerApp.execute(stopCommand);
    }
}

/*
Explanation to this action:
mowerApp.execute(startCommand); is called!
-------------------------------------------
The invoker class MowerApp is called with the method execute, which accepts a type of command as argument. 
Inside the execute method is:  command.run(); which is = startCommand.run(). Hereby we have a instance StartCommand of type
StartCommand which calls its definition of run().
*/
