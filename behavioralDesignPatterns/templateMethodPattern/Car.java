package behavioralDesignPatterns.templateMethodPattern;

public class Car extends Vechicle {
    void getEngine() {
       System.out.println( "4 cylinder");
    }

    void getTires() {
       System.out.println( "4 tires");
    }
}
