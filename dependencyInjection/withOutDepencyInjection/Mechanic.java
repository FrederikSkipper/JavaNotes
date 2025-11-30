package dependencyInjection.withOutDepencyInjection;

public class Mechanic {
    private Car tesla; 
    private Car audi; 

    public Mechanic() {
        tesla = new tesla();
        audi = new audi(); 
    }

    /* 

    // The code for fixing a car \\
    public void fixCar(){
        System.out.println("Fixing car");
    }
    */

    public void fixtesla() {
        System.out.println("fixing tesla");
    }

    public void fixaudi() {
        System.out.println("fixing tesla");
    }

}
