package creationalDesignPatterns.FactoryDesignPattern;
// Concrete creator
public class DorritosEmployee extends SnackEmployee {
    @Override
    Snack findIngredients() {
        return new Dorritos();
    }
}
