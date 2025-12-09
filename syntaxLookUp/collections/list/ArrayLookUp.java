package syntaxLookUp.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLookUp {
    public static void main(String[] args) {
    String[] booksList = new String[] {"math", "biology"}; // initialise array
    String[] booksListTwo = new String[] {"math", "biology"}; // initialise array

    booksList[1] = "calculus"; // change element value
    int booksnumber = booksList.length; // get length of array

    Arrays.compare(booksList, booksListTwo); // return true if equal. 

    /* Convert Array to ArrayList */
    // Method 1 (WRONG) - List is fixes size!)
    List newbooksOne = Arrays.asList(booksList);
    newbooksOne.add("computer science"); // ERROR: UnSupportedOperation
    
    /* Method 2 RIGHT - we pass the array as a list, to the ArrayList constructor. (It is constructed as resizible) */
    List<String> newBooks = new ArrayList<String>(Arrays.asList(booksList)); 


    }

}