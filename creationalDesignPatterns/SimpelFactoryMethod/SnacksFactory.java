package creationalDesignPatterns.SimpelFactoryMethod;

public class SnacksFactory {
    /* 
    public static Snack assembleSnack(String name, int price) {
    return new Popcorn(name, price);
    }
    */


    public static Snack assembleSnack(SnackType type, String name, int price) {
        switch(type) {
        case Dorritos:
        return new Dorritos(name, price);
        break;
        case Popcorn:
        return new Popcorn(name, price);
    }
}   
}