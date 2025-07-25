package Day_5;

interface CalcA {
	int div(int numerator, int denominator);
}

interface CalcB {
	int div(int numerator, int denominator);
}

interface CalcC {
	int div(int numerator, int denominator);
}

class MathProcessor implements CalcA, CalcB, CalcC {
	@Override
	public int div(int numerator, int denominator) {
	return (numerator/denominator);
	}
}
public class Main {

	public static void main(String[] args) {
		MathProcessor obj = new MathProcessor();
		obj.div(50,10);
		
		CalcA a = new MathProcessor();
		System.out.println("CalculatorA:- Division:" +a.div(24, 3));
		
		CalcA b = new MathProcessor();
		System.out.println("CalculatorB:- Division:" +b.div(24, 3));
		b.div(45, 5);  // calls result isn't printed
		
		CalcA c = new MathProcessor();
		System.out.println("CalculatorB:- Division:" +c.div(24, 3));
		c.div(45, 5);

	}

}
