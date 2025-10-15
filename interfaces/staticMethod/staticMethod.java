package interfaces.staticMethod;

interface insect {
    // Static method can have body unlike abstact
    static void lifetime () {
        System.out.println("insect age");
    }
    //This method need to be overridden!
    void overrideMethod(String age);
}

class snail implements insect {
    public static void main(String[] args) {
        snail mySnail = new snail(); // create snail object

        insect.lifetime(); // output: insect age (We can only use static method via interface.staticMethod - can only be called using interface as context)

        mySnail.overrideMethod("Overriding second method in insect"); // Output "overiding second method in insect"
    }
    @Override
    public void overrideMethod(String age){
        System.out.println(age);
    }
}