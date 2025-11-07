package creationalDesignPatterns.SimpelFactoryMethod;

public class SnacksFactory {
    /* 
    public static Snack assembleSnack(String name, int price) {
    return new Popcorn(name, price);
    }
    */


    public Snack assembleSnack(SnackType type) {
        Snack snack = null;
        if (type.equals(SnackType.DORRITOS)) {
        snack = new Dorritos(null, 0);
        } else if (type.equals(SnackType.POPCORN)){
            snack = new Popcorn(null, 0);
        }  
        return snack;
    }
}