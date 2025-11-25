package behavioralDesignPatterns.visitorPattern;

// Visitor interface
public interface VechicleInspector {
    void inspectCar(Car car);
    void inspectMotorbike(Motorbike motorbike);
}
