package creationalDesignPatterns.FactoryDesignPattern;
// Concrete product
public class Dorritos implements Snack {
    @Override
    public void printIngredients() {
        System.out.println("Dorritos ingredients");
    }
}
