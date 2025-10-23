package methods.staticVSpublic;

public class Calculations {
	static void diagonalStatic() { // Static method: 
	System.out.println("Prints diagonal lenght");
	}
    public void diagonalPublic() { // public method:
	System.out.println("Prints diagonal lenght");
	}
	public static void main(String[] args) { // main method
		diagonalStatic(); // output: Prints diagonal lenght
		diagonalPublic(); // output: Error
		
		Calculations triangle = new Calculations();
		triangle.diagonalPublic(); // Now it prints diagonal lenght
		}
}