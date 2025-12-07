package syntaxLookUp;
import java.util.ArrayList;
import java.util.List;

/*
EXPLANATION: Resizible array that maintains order and allow for duplicates. 
*/

public class ArrayListLookUp {
    public static void main(String[] args) {

    ArrayList<String> booksList = new ArrayList<String>(); // ArrayList containing objects
    booksList.add("Harry potter 2");
    booksList.add(0, "harry potter 1"); // index, element

    booksList.remove(0);

    booksList.clear(); // removes all

    booksList.size(); // returns size of ArrayList
    
    booksList.get(0);

    booksList.getFirst();

    booksList.getLast();

    booksList.contains("harry potter 2"); // return true or false

    booksList.remove(0);

    for (String book : booksList) {
        book.replace("harry potter","batman");
    }

    for (int i = 0; i < booksList.size(); i++) {
        System.out.println(booksList.getFirst());
    }

    /* Convert from arrayList to array */
    Integer[] booksArray = new Integer[booksList.size()];
    booksArray = booksList.toArray(booksArray);

    }   
}
