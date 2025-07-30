package Day_8;

public class Wrapper_Classes {

	public static void main(String[] args) {
		// Integer
		int a = 12;
		Integer i = a; // when we convert int datatype to integer is called auto boxing.
		//int b = i.intValue(); //object back to int datatype is called auto unboxing.
//		int b = i;
		System.out.println(i);
		
		// converting String to Integer using parseInt()
		String d = "6";
		int num = Integer.parseInt(d);
		System.out.println("Number is:" +num);
		
		// String to double 
		String g = "12.557";
		double r = Double.parseDouble(g);
		System.out.println(r);
		
		// String to float
		String s = "2.45f";
		float f = Float.parseFloat(s);
		System.out.println(f);


	}

}
