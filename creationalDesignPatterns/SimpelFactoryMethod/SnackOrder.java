package creationalDesignPatterns.SimpelFactoryMethod;

public class SnackOrder {
SnackType type;

    public SnackOrder(SnackType type) {
        this.type = SnackType.DORRITOS; 
    }   

    SnackOrder myOrder = new SnackOrder(SnackType.DORRITOS);
  }
