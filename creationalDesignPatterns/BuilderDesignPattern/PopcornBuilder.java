package creationalDesignPatterns.BuilderDesignPattern;

// Concrete builder 
public class PopcornBuilder implements Builder {
    private Snack dorritos = new Snack();

    public void buildSaltAmount() {
        dorritos.setSaltAmount(10);
    }

    public void buildPepperAmount() {
        dorritos.setPepperAmount(12);
    }

    public void buildWheatAmount() {
        dorritos.setWheatAmount(11);
    }
    
    public Snack getIngredients() {
        return dorritos;
    }
}
