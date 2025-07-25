package Day_5;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Operations();
		c.add(300, 500);
		System.out.println("Substraction is:" +c.substract(245.56, 50.776));
		System.out.println("Multiplication is:" +Calculator.mutliply(19, 13));
	}

}
