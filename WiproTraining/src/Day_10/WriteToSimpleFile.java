package Day_10;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToSimpleFile {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("C:\\Users\\kashi\\Desktop\\JavaP.txt");
			
			file.write("Hello, Welcome to Java Selenium Training.");
			file.close();
			
			System.out.println("Data written to file successfully.");
		}
		catch(IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}

}
