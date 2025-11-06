package creationalDesignPatterns.SimpelFactoryMethod;

public class SnacksFactory {
    
    public Snack assembleSnack(String request) {
        if ("Dorritos".equals(request)){
            return new Dorritos();
        } else if (("Popcorn").equals(request)){
            return new Popcorn();
        }
    }
}
