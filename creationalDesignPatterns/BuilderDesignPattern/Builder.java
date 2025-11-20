package creationalDesignPatterns.BuilderDesignPattern;

// Builder iterface
interface Builder {
    void buildSaltAmount();
    void buildPepperAmount();
    void buildWheatAmount();
    Snack getIngredients();
}

