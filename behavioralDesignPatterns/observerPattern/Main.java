package behavioralDesignPatterns.observerPattern;

public class Main {
    public static void main(String[] args){
        // Create follower with userId's.
        Follower Skipper = new Follower(20);

        // starting IGSystem
        IGSystem igSystem = new IGSystem();
        igSystem.getNotification(Skipper);

        // A new post has come
        igSystem.addIgPost("hej");
    }
}
