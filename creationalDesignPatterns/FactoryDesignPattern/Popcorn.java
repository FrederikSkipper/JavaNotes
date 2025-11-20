package creationalDesignPatterns.FactoryDesignPattern;
// Concrete product
public class Popcorn implements Snack {
    @Override
    public void printIngredients() {
        System.out.println("Popcorn ingredients");
    }
}
