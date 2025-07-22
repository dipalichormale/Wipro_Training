package dayOne;

public class Calculator_RuntimeData {
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Calculator_RuntimeData calc = new Calculator_RuntimeData();
	    	int sum = calc.add(5,7);
	    	System.out.println("Sum :" +sum);
	}

}