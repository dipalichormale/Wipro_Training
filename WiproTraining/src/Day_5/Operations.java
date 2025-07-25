package Day_5;

public class Operations implements Calculator {
	@Override
	public void add(int a, int b) {
		System.out.println("The Addition of " + a + " and " + b + ";" +(a+b));
	}

}
