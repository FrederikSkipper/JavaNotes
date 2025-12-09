package syntaxLookUp.collections.list;

import java.util.LinkedList;

public class LinkedListLookUp {
    public static void main(String[] args) {

    LinkedList<String> booksList = new LinkedList<String>(); // LinkedList

    booksList.addFirst("Harry potter 1");
    

    booksList.addLast("Harry potter 2");

    booksList.removeFirst();

    booksList.removeLast();

    booksList.getFirst();

    booksList.getLast();

    }
}