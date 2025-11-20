package behavioralDesignPatterns.templateMethodPattern;


public class MotorBike extends Vechicle {
    void getEngine() {
       System.out.println( "2 cylinder");
    }

    void getTires() {
       System.out.println( "2 tires");
    }
}
