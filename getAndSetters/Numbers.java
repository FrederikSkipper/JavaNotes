package getAndSetters;

public class Numbers {
	private int even = 2;
	// getter 
	public int getEven() {
	return even; // returns 2
	}
	// setter
	public void setEven(int even) {
	this.even = even; // myNumbers.even = input "2"
	}
}

    class Main {
    public static void main (String[] args) {
        Numbers myNumbers = new Numbers();
            myNumbers.even = 4; // error (We can NOT access .even because it is private!)
            myNumbers.setEven(2); // Correct (We use a public method)
            System.out.println(myNumbers.getEven());
    }
}
