package structuralDesignPatterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        // create a tesla of type TeslaModelY
        Tesla tesla = new TeslaModelY(); // Overriddes the getPrice and Getspecs methods from tesla interface.
        System.out.println(tesla.getPrice()+tesla.getSpecs()); // 300000 + Model Y
        
        
        tesla = new FsdDecorator(tesla); // Call this constructor on the above tesla model y. 
        System.out.println(tesla.getPrice()+tesla.getSpecs()); // 300000 + Model Y + Full self drive 

        tesla = new AutoPilotDecorator(tesla);
        System.out.println(tesla.getPrice()+tesla.getSpecs()); // 300000 + Model Y + Full self drive + Autopilot
        
    }
}
