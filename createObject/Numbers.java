package createObject;

public class Numbers {
	public int x;

    public Numbers() { // constructor
        x = 8; 
    }
	
	public static void main(String[] args) {
		Numbers evenNumbers = new Numbers(); // calls constructor Numbers to create object evenNumbers.
		System.out.println(evenNumbers.x);
	 }
 }
