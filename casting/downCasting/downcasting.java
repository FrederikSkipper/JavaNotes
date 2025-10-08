package casting.downCasting;

public class downcasting {
    public static void main(String[] args){
        
    snail mySnail = new snail(); // creating a snail object  
    insectStuff(mySnail); // output: slime attack snail age (We passed snail correct)
   
    bee myBee = new bee(); // creating a bee object
    insectStuff(myBee); // output: ClassCasting-ERROR (We pass a Bee but says in the downcast to expect a snail)

    }
    public static void insectStuff(insect insect){
        snail mySnail = (snail)insect; // downcasting insect to be a snail. (Telling java i know it is an insect but trust me it is a snail and treat it that way)
        mySnail.slime(); // "slime attack"
        mySnail.lifetime(); //  "snail age"
        mySnail.legs(); // "snail legs"
    }

}
