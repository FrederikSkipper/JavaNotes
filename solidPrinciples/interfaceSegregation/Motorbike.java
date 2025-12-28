package solidPrinciples.interfaceSegregation;


interface info{
    void maxSpeed();

    void aircondition();
}

public class Motorbike implements info {
    // We are forced to implement all from the interface
    public void maxSpeed() {
        System.out.println("200km/h");
    }

    public void aircondition() {
        System.out.println("We do not have aircon"); // Forced to implement.
    }
}

/*------ After. Valid: more specific interfaces */

interface infoMotorbike{
    void maxSpeed();
}

interface infoTwo{
    void maxSpeed();

    void aircondition();
}

class MotorbikeTwo implements infoMotorbike {
    // We are forced to implement all from the interface
    public void maxSpeed() {
        System.out.println("200km/h");
    }
}