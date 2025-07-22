package dayOne;
import java.util.Scanner;

public class UserInputDataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.nextLine(); //reference data type
		
		System.out.println("Enter your score (int):");
		int score = sc.nextInt(); //primitive data type
		
		System.out.println("Enter your height (double):");
		double height = sc.nextDouble();
		
		System.out.println("\nHello," +name);
		System.out.println("\nScore," +score);
		System.out.println("\nHeight," +height);
		
	}

}
