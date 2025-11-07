package creationalDesignPatterns.SimpelFactoryMethod;

public class SnackOperations {     

    public Snack callFactory() {
        SnacksFactory factory = new SnacksFactory();
        Snack snack = factory.assembleSnack(SnackType.DORRITOS);
        return snack;
    }
}
