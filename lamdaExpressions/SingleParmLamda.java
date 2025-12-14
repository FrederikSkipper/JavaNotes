package lamdaExpressions;

import java.util.ArrayList;

public class SingleParmLamda {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add(0, "hey");
        newList.add(1, "how");
        newList.forEach(word -> System.out.println(word));
    }

}
