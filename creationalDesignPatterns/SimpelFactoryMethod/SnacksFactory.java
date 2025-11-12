package creationalDesignPatterns.SimpelFactoryMethod;

public class SnacksFactory {

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