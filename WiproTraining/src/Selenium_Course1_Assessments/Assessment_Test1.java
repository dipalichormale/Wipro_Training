package Selenium_Course1_Assessments;

public class Assessment_Test1 {
	public static void main(String[] args) {
		//Implicit Type Casting  (Widening conversion
		int intValue = 10;
		double doubleValue = intValue;
		
		System.out.println("Implicit Type Casting  (Widening conversion)");
		System.out.println("int:" +intValue);
		System.out.println("double:" +doubleValue);
		
		// Explicit Type Casting (Narrowing conversion)
		double anotherDoubleValue =  15.56;
		int anotherIntValue = (int)anotherDoubleValue; // double s explicitly cast to int
		
		System.out.println("\nExplicit Type Casting  (Narrowning conversion)");
		System.out.println("double:" +anotherDoubleValue);
		System.out.println("int:" +anotherIntValue);		

	}

}
