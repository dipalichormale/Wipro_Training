package Day_6;

public class Factorial_Exception {
	
	public static long calculateFactorial(long n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial is not defined for -ve number");
		}
		
		long res = 1;
		for(int i=2; i<=n; i++) {
			res *=i;
		}
		return res;
	}

	public static void main(String[] args) {
		int n = -5;
		
		try {
			System.out.println("calculate factorial of " + n + "...");
			long factResult = calculateFactorial(n);
			System.out.println("Factorial of " + n + " is: " + factResult);
		}
		catch(Exception e) {
			System.out.println("Caught an Exception: " +e.getMessage());
			
		}
		finally {
			System.out.println("Factorial calculation attempt concluded.");
		}
	

	}

}
