package streamAPi.TerminalMethods;

import java.util.Arrays;
import java.util.List;

public class TerminalMethods {
    public static void main (String[] args) {
    List<Integer> numbs = Arrays.asList(2,5,3,9,6);
    List<Integer> numbsTwo = Arrays.asList(1,1,3,3,7,9,25);
    numbs.stream().map(element -> element+5); // returns a stream of a function applied to each elements. 
    
    numbs.stream().filter(element -> element % 2 == 0).findFirst(); // returns the first element that is even
    
    numbs.stream().sorted().count(); // return the number of elements in sorted stream

    numbsTwo.stream().distinct().forEach(System.out::println);; // now prints out for each element. 
    }
}
