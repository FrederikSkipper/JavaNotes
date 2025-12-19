package streamAPi.IntermediateMethods;

import java.util.Arrays;
import java.util.List;

public class IntermediateMethods {
    public static void main (String[] args) {
    List<Integer> numbs = Arrays.asList(2,5,3,9,6);
    List<Integer> numbsTwo = Arrays.asList(1,1,3,3,7,9,25);
    numbs.stream().map(element -> element+5); // returns a stream of a function applied to each elements. 
    
    numbs.stream().filter(element -> element % 2 == 0); // returns a stream of even numbers
    
    numbs.stream().sorted(); // returns stream sorted in normal order ASC

    numbsTwo.stream().distinct(); // returns stream without duplicates
    }
}
