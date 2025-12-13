package methods.staticVSpublic.methodReference;

import java.util.*;

public class MethodToInstanceOfAbritaryClass {

    static public void doSum() { 
	}
    public static void main(String[] args) {

        ArrayList<String> anyList = new ArrayList<>();

        anyList.addFirst("FirstElement");
        anyList.addFirst("NewFirstElement");

        anyList::doSum;
    }
}
