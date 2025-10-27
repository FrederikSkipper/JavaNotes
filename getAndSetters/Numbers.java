package getAndSetters;

public class Numbers {
	private int even = 2;
	private int odd;
	public int prime;

	// getter 
	public int getEven() {
	return even; // returns 2
	}

	// setter
	public void setOdd(int odd) {
	this.odd = odd; // myNumbers.odd = input "4"
	}
}

    class Main {
    public static void main (String[] args) {
        Numbers myNumbers = new Numbers();
            myNumbers.even = 4; // error (We can NOT access .even because it is private!)
			myNumbers.prime = 2; // we can acces since it is public
            myNumbers.setOdd(4); 
            System.out.println(myNumbers.getEven() + myNumbers.prime);
    }
}
