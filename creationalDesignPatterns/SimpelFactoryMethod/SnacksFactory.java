package creationalDesignPatterns.SimpelFactoryMethod;

public class SnacksFactory {
    /* 
    public static Snack assembleSnack(String name, int price) {
    return new Popcorn(name, price);
    }
    */


    public Snack assembleSnack(SnackOrder myOrder) {
        Snack snack = null;
        if (myOrder.type.equals(SnackType.DORRITOS)) {
        snack = new Dorritos("dorritos", 30);
        } else if (myOrder.type.equals(SnackType.POPCORN)){
            snack = new Popcorn("popcorn", 20);
        }  
        return snack;
    }
}