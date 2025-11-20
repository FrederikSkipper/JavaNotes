package creationalDesignPatterns.FactoryDesignPattern;
// Creator Superclass
abstract class SnackEmployee {
    // factory method
    abstract Snack findIngredients(); // Overrriden by either concrete creator

    // initiated by: concreteCreator.ingredientsFinder in Main. 
    public void ingredientsFinder() {

        // snack = new durrotos()    OR   snack = new popcorn().
        Snack snack = findIngredients(); // This is the overriden method which return the Dorritos or Popcorn
        snack.printIngredients(); // Now we can use the concrete Product (popcorn or dorritos) to get the ingridients. E.g dorritos.printIngredients.
    }
}
