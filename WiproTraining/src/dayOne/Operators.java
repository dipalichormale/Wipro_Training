package dayOne;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic 
		int a = 10, b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		// Relational/Comparison
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		// Logical 
		System.out.println(a>0 && b>0);
		System.out.println(a>6 ||  b<15);
		System.out.println(!(a == b));
		
		// Assignment
		int x = 5;
		x += 7;
		System.out.println(x);
		
		// Unary
		System.out.println(++a); // prefix
		System.out.println(b--); // postfix 

	}

}
