package creationalDesignPatterns.BuilderDesignPattern;

// Product
public class Snack {
    private int saltAmount;
    private int pepperAmount;

    private int wheatAmount;

    public void setSaltAmount(int saltAmount) {
        this.saltAmount = saltAmount;
    }

    public void setPepperAmount(int pepperAmount) {
        this.pepperAmount = pepperAmount;
    }

    public void setWheatAmount(int wheatAmount) {
        this.wheatAmount = wheatAmount;
    }


}
