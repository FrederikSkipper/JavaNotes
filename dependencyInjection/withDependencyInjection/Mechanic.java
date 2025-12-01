package dependencyInjection.withDependencyInjection;

public class Mechanic {
    private Car car;

    // The mechanic constructor is provided the car instance (tesla or audi)
    // Here we Inject the dependency car onto the Constructor Mechanic. 
    public Mechanic(Car car) {
        this.car = car;
    }

    public void fixCar(){
        // fix car code
    }

    // MAIN CODE:
    // audiMechanic instance belongs to class Mechanic but is constructed by the Audi class default constuctor.
    Mechanic audiMechanic = new Mechanic(new Audi());

}
