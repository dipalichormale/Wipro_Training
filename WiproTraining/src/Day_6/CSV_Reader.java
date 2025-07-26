package Day_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CSV_Reader {

	public static void main(String[] args) {

		File csv = new File("C:\\Users\\kashi\\Desktop\\mycsv.csv");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(csv));
			String line = br.readLine();

			while (line != null) {
				System.out.println("Line: "  + line);
				line = br.readLine();
			}
				br.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: The specified CSV file was not found at " + csv.getAbsolutePath());
		} 
		catch (IOException e) {
			System.out.println("Error: An I/O error occurred while reading the CSV file."); 
		} 
		finally {
			System.out.println("Complete Execution");
			
		}
	}
}



