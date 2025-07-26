package Day_6;


public class Division {

	public static void main(String[] args) {
		int i = 0, j = 14,res;
        try {
            res = j / i;
            System.out.println("Division gone right: " +res);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division gone wrong." +e.getMessage());
            System.out.println(e);
        }
        finally {
        	System.out.println("Operation completed.");
        }

	}

}
