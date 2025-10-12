package superKeyword;

public class snail extends insect {
    String slimeType; 

    public snail(String type, String slimeType) {
        /* We want snail to also have a type and therefore calls the superclass 
         * (insect) constructor, because it has this property. 
         * This has to be the first line inside the subclass constructor
         */
        super(type); 
        this.slimeType = slimeType;
    }
    @Override
    public void lifetime() {
        super.lifetime(); // prints "insect age"
        System.out.println("snail age"); // prints "snail age"
    }
    public void slime() {
        System.out.println("snail age");
    }
}
