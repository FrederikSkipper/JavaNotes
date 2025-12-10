package syntaxLookUp.collections.map;

import java.util.HashMap;

/* Explanation:
- Key must be uniqeue but value can be duplicate
- Store key value pairs. 
- Can store String/Int, String/String
- Does not keep keys ordered
- Allows one key to be null.
*/


public class HashMapLookUp {

    public static void main(String[] args) {
    HashMap<String,String> booksList = new HashMap<>(); // declare
    
    booksList.put("harry potter 1", "2 dollars");

    booksList.remove("harry potter 1");

    booksList.get("harry potter 1"); // refer to the key (output: 2 dollars)


    booksList.containsKey("harry potter 1"); // boolean

    booksList.keySet(); // return set of keys

    booksList.size(); // return set of keys

    booksList.clear();

    booksList.replace("harry potter 1", "2 dollars", "4 dollars");

    booksList.containsKey("harry potter 1"); // boolean
    booksList.containsValue("2 dollars"); // boolean
    
    for (String book : booksList.keySet()){ // iterates over each key and does something.
        //logic
    }

    for (String book : booksList.values()){ // iterates over each value and does something.
        //logic
    }

    }
}
