package scope;
/*
Explanation:
Local variable shadowing is when a local variable shadows an instance variable.
*/
public class VariableShadowing {
    // Instance variable
    String book = "Harry potter";

    public void title(){
        // Local
        String book = "Toy story";
        System.out.println(book);
    } 
}

class main {
    public static void main(String[] args) {
        VariableShadowing caller = new VariableShadowing();
        caller.title(); // prints "Toy story"
    }
}
