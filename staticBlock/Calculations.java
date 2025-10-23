package staticBlock;

class Calculations {
	static int a = 10;
	static int b;
	
	//static block
	static {
	System.out.println("preCalculations");
	b = a * 2;
	}
	
	public static void main(String[] args) {
		System.out.println("value of a: "+a); 
		System.out.println("value of b: "+b); 
		}
}

/* 
 * [OUTPUT]:
 *  value of a:10
 *  value of b:20
 */