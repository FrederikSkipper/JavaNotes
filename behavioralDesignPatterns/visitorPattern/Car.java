package behavioralDesignPatterns.visitorPattern;

// Concrete element
public class Car implements Vechicle {
    public void accept(VechicleInspector inspector) {
        inspector.inspectCar(this);
    }
}
