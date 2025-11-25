package behavioralDesignPatterns.visitorPattern;

// Concrete element
public class Motorbike implements Vechicle {
    public void accept(VechicleInspector inspector) {
        inspector.inspectMotorbike(this);
    }
}

