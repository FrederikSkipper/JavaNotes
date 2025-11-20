package creationalDesignPatterns.FactoryDesignPattern;
// Concrete Creator
public class PopcornEmployee extends SnackEmployee {
    @Override
    Snack findIngredients() {
        return new Popcorn();
    }
}

