package Day_6;

public class ArrayException {

	public static void main(String[] args) {
		try {
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch an exception:" +e.getMessage());
			System.err.println("Error: you tried to acess an element outside the array's bounds.");
		}
		finally {
			System.out.println("Operation Completion");
		}
	}

}
