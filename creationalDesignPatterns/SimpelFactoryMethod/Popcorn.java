package creationalDesignPatterns.SimpelFactoryMethod;

public class Popcorn implements Snack {
    private String name;
    private int price;
    SnackType type;
  

    public Popcorn(String name, int price, SnackType type) {
        this.name = name;
        this.price = price;
        this.type = SnackType.POPCORN;
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