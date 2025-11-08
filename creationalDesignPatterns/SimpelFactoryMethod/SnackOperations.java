package creationalDesignPatterns.SimpelFactoryMethod;

public class SnackOperations {     

    public Snack callFactory(SnackOrder myOrder) {
        SnacksFactory factory = new SnacksFactory();
        Snack snack = factory.assembleSnack(myOrder);
        snack.getName();
        snack.getPrice();
        return snack;
    }
}
