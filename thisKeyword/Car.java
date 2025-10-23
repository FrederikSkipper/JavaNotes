package thisKeyword;

public class Car {
    String name; 
    
    public Car(String name) {
        this.name = name; // this.myObj = passed in name.    myCar.name = Toyota
    }
    public static void main(String[] Args) {
        Car myCar = new Car("Toyota"); 
        System.out.println(myCar.name);
    }
}
