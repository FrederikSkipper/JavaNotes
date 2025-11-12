package creationalDesignPatterns.FactoryDesignPattern;

public class DorritosEmployee extends SnackEmployee {
    @Override
    Snack findIngredients() {
        return new Dorritos();
    }
}
