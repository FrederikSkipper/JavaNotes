package methods.staticVSpublic.methodReference;

import java.util.*;

public class MethodReference {
    public static void main(String[] args) {
    /*------------------------------------------------------------- */
    // Reference to static method
    ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");

        // before 
        words.forEach(word -> System.out.println(word));

        // after
        words.forEach(System.out::println);
    
    /*------------------------------------------------------------- */
    // Reference to an method of a specific instance
    Person person = new Person();
    
    // before 
    words.forEach(word -> person.talk(word));

    // after
    words.forEach(person::talk);

    /*------------------------------------------------------------- */
    // Reference to an method of abritary instance but specific type
    
    // before
    words.forEach(word -> word.length());

    // after
    words.forEach(String::length);

    /*------------------------------------------------------------- */
    // Reference to contructor
    // For later development
    



    }
}
