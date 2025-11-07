package creationalDesignPatterns.SimpelFactoryMethod;
import creationalDesignPatterns.SimpelFactoryMethod.SnackType;
public class Dorritos implements Snack {
    private String name;
    private int price;
    SnackType type;
  

    public Dorritos(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public SnackType getSnackType() {
        return this.type;
    }
}