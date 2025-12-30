package behavioralDesignPatterns.visitorPattern;

public class Main {
    public static void main(String[] args) {
        // Create Concrete elements
        Vechicle audi = new Car(); // It is legal to upcast a class to an interface type, when we implement their methods.  
        Vechicle kawasaki = new Motorbike();

        // Create concrete visitor
        VechicleInspector inspector = new  VechicleTest();

        // Apply
        audi.accept(inspector); // Output: "Car has been inspected!"
        kawasaki.accept(inspector);
    }
}
