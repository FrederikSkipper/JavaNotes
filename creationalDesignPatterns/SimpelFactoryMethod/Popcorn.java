package creationalDesignPatterns.SimpelFactoryMethod;

public class Popcorn implements Snack {
    private String name;
    private int price;
  

    public Popcorn(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}