package casting.upCasting;
public class upcasting{
    public static void main(String[] args){
    insect myInsect = new snail(); // Creating a snail object and casting it to be an insect type (UPCASTING)

    myInsect.lifetime(); // Casting succes (We use insect class own methods. output: snail lifetime)
    
    insectStuff(myInsect); 
    // Output: Snail lifetime, Snail legs (Java takes the input of any insect also subclass snail)
    // So since we declared myInsect is an instance of class snail it uses the snail method. (Overridden)



    snail mySnail = new snail(); // creating a snail object  
    insectStuff(mySnail); // output: snail lifetime + snail legs (We pass any object that is insect class or a subclass thereoff to the function)
   


    }
    public static void insectStuff(insect insect){
        insect.lifetime(); // parent and child method, but parent is overriden so child method. 
        insect.legs(); // parent method works
        insect.slime(); // Casting ERROR (The type we expect in the arguments for insectStuff determines the methods we can call and slime is not a method of insect)
    }
}
