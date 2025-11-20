package creationalDesignPatterns.BuilderDesignPattern;

// Concrete builder 
public class DorritosBuilder implements Builder {
    private Snack dorritos = new Snack();

    public void buildSaltAmount() {
        dorritos.setSaltAmount(20);
    }

    public void buildPepperAmount() {
        dorritos.setPepperAmount(15);
    }

    public void buildWheatAmount() {
        dorritos.setWheatAmount(10);
    }
    
    public Snack getIngredients() {
        return dorritos;
    }
}
