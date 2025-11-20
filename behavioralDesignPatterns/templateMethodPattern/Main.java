package behavioralDesignPatterns.templateMethodPattern;

public class Main {
    public static void main(String[] args) {
        Vechicle ducati = new MotorBike();
        ducati.assembleVechicle();
        // Output:
        // 2 tires
        // 2 cylinder
        // testing topspeed
        // testing brakes
    }
}
