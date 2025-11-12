package creationalDesignPatterns.FactoryDesignPattern;

abstract class SnackEmployee {
    // factory method
    abstract Snack findIngredients(); // Overrriden

    public void ingredientsFinder() {
        // snack = new durrotos()    OR   snack = new popcorn().
        Snack snack = findIngredients();
        snack.printIngredients();
    }
}
