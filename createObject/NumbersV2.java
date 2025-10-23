package createObject;

public class NumbersV2 {
	public int x;

    public NumbersV2(int number) { // constructor
        this.x = number; 
    }
	
	public static void main(String[] args) {
		NumbersV2 evenNumbers = new NumbersV2(2); // calls constructor Numbers to create object evenNumbers.
		System.out.println(evenNumbers.x);
	 }
 }
