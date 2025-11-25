package behavioralDesignPatterns.visitorPattern;

// Concrete visitor 
public class VechicleTest implements VechicleInspector {
    public void inspectCar(Car car) {
        System.out.println("Car has been inspected!");
    }

    public void inspectMotorbike(Motorbike motorbike) {
        System.out.println("Motorbike has been inspected!");
    }
}
