package creationalDesignPatterns.SimpelFactoryMethod;

public class Popcorn extends Snack {
    String[] ingrediens = {"salt", "wheat", "sirup"};

    public String[] popcorn() {
        return ingrediens;
    }
}
