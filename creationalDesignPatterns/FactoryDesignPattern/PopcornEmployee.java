package creationalDesignPatterns.FactoryDesignPattern;

public class PopcornEmployee extends SnackEmployee {
    @Override
    Snack findIngredients() {
        return new Popcorn();
    }
}

