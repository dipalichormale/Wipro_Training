package Day_5;

public interface Calculator {
	void add(int a, int b);
	
	default double substract(double a, double b) {
		return (a-b);
	}
	
	static int mutliply(int a, int b) {
		return (a*b);
	}
}

