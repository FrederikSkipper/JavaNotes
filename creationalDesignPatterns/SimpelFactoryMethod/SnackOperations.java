package creationalDesignPatterns.SimpelFactoryMethod;

public class SnackOperations {     

    public Snack callFactory() {
        Snack popcorn = SnacksFactory.assembleSnack(DORRITOS,"SandyPopcorns", 200);
        return popcorn; 
    }
}
