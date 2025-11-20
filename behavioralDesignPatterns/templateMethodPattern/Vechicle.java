package behavioralDesignPatterns.templateMethodPattern;

abstract class Vechicle {
    // template method
    final void assembleVechicle() {
        getTires();
        getEngine();
        testTopspeed();
        testBrakes();
    }
    // Methods Needs to be overridden (Automatic enforce with abstract!)
    abstract void getTires();
    abstract void getEngine();

    // Optional can be overridden
    void testTopspeed(){
        System.out.println("Testing topspeed");
    }

    void testBrakes(){
        System.out.println("Testing brakes");
    }

    
}
