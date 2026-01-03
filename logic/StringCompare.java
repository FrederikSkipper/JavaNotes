package logic;

public class StringCompare {
    public static void main(String[] args) {
        
    String one = new String("oh");
    String two = new String("oh");
    String three = "oh";
    String four = "oh";

    {/*one == two*/} // False (Not the same objects)

    one.equals(two); // true (Checks String values)
    three.equals(four); // true (Checks String values)

    three==four; // Compile error, but True

    System.out.println(three == four); // Checks for reference equality TRUE
    
    System.out.println(one == two); // Checks for reference equality FALSE
    
}   
