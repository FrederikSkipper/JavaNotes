package behavioralDesignPatterns.visitorPattern;

public class Main {
    public static void main(String[] args) {
        // Create Concrete elements
        Vechicle audi = new Car();
        Vechicle kawasaki = new Motorbike();

        // Create concrete visitor
        VechicleInspector inspection = new  VechicleTest();

        // Apply
        audi.accept(inspection); // Output: "Car has been inspected!"
        kawasaki.accept(inspection);
    }

}
