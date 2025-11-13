package creationalDesignPatterns.BuilderDesignPattern;

// Product
class Snack {
    private int saltAmount;
    private int pepperAmount;

    private int wheatAmount;

    public int getSaltAmount() {
        return this.saltAmount;
    }

    public int getPepperAmount() {
        return this.pepperAmount;
    }

    public int getWheatAmount() {
        return this.wheatAmount;
    }

    // Director
    private Snack(SnackBuilder builder) {
        this.pepperAmount = builder.pepperAmount;
        this.saltAmount = builder.saltAmount;
        this.wheatAmount = builder.wheatAmount;

    }
    // Builder
    public static class SnackBuilder {
        private int saltAmount;
        private int pepperAmount;

        private int wheatAmount;

        public SnackBuilder(int saltAmount, int pepperAmount) {
            this.saltAmount = saltAmount;
            this.pepperAmount = pepperAmount;
            }

        public SnackBuilder setWheatAmount(int wheatAmount) {
            this.wheatAmount = wheatAmount;
            return this;
            }
            
        public Snack build() {
            return new Snack(this);
        }

    } 

    // Client
    public class Main {
    public static void main(String[] args) {
        // Method chaining. 
        Snack dorritos = new Snack.SnackBuilder(10, 20).setWheatAmount(20).build();
        Snack popcorn = new Snack.SnackBuilder(10, 20).build();
        System.out.println(dorritos);
        System.out.println(popcorn);

        System.out.println(dorritos.getWheatAmount());

        System.out.println(popcorn.getSaltAmount());
        System.out.println(popcorn.getWheatAmount()); // default Zero, becouse it was optional and not chosen to build by client.


    } 
}

}
