package dependencyInjection.withDependencyInjection;

public class Mechanic {
    private Car car;

    // The mechanic constructor is provided the car instance (tesla or audi)
    // Here we Inject the dependency car onto the Constructor Mechanic. 
    public Mechanic(Car car) {
        this.car = car;
    }

    // MAIN CODE:
    // audiMechanic instance belongs to class Mechanic but is constructed by the Audi class default constuctor.
    public static void main(String[] args) {
        Mechanic audiMechanic = new Mechanic(new Audi());
    }

}
