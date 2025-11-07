package creationalDesignPatterns.SimpelFactoryMethod;

public class SnackOrder {
   SnackType type;

    public SnackOrder(SnackType type) {
        this.type = SnackType.DORRITOS; 
    } 
   
     public SnackType getOrder() {
        return this.type;
    }

}
