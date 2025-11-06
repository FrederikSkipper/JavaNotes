package creationalDesignPatterns.SimpelFactoryMethod;

public class SnackOperations {

    public Snack callFactory(String request) {
        SnacksFactory factory = new SnacksFactory();
        Snack snack = factory.assembleSnack(request);
        return snack;
    }
}
