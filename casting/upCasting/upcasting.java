package casting.upCasting;
public class upcasting{
    public static void main(String[] args){
    insect myInsect = new snail(); // creating an snail object an casting it to be an insect UPCASTING

    myInsect.lifetime(); // Casting succes (We use insect class own methods. output: insect age)
    
    insectStuff(myInsect); 
    // Output: snail age (Java takes the input of any insect also subclass snail 
    // So since we declared myInsect is a snail it uses the snail method. 


    snail mySnail = new snail(); // creating a snail object  
    insectStuff(mySnail); // output: snail age + snail legs (We pass any object that is insect class or a subclass thereoff to the function)
   


    }
    public static void insectStuff(insect insect){
        insect.lifetime(); // parent and child method, but child is overriden so child method. 
        insect.legs(); // parent method works
        insect.slime(); // Casting ERROR (Even though myInsect is a snail object it is treated belonging to the insect class and its methods)
    }
}
