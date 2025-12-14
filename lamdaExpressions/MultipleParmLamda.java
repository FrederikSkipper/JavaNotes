package lamdaExpressions;

/*
Explanation:
We have an interface with a function without body.
We create a variable of the interface type and initialize that variable the lamda expression.
Thereafter we call the interface method on the variable with our arguments.  
*/

interface SizeFunc {
    int sizing(String a, String b);
}

public class MultipleParmLamda {
    public static void main(String[] args) {
        String wordOne = "hey";
        String wordTwo = "how";

        SizeFunc size = (a,b) -> a.length() + b.length();

        int sizes = size.sizing(wordOne, wordTwo);
    }
}
