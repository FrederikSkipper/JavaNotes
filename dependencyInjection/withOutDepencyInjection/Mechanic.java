package dependencyInjection.withOutDepencyInjection;

public class Mechanic {
    private Car tesla; 
    private Car audi; 

    public Mechanic() {

        // Tight coupling
        tesla = new tesla();
        audi = new audi(); 
    }

    public void fixTesla() {
        System.out.println("fixing tesla");
    }

    public void fixAudi() {
        System.out.println("fixing tesla");
    }

}
