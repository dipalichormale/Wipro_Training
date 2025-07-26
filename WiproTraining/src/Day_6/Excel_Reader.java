package Day_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Excel_Reader {

	public static void main(String[] args) {
		File  f1 = new File("C:\\Users\\kashi\\Downloads\\Selenium_Dayise.xlsx");
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(f1));
			String line = br1.readLine();
			while(line != null) {
				System.out.println("File Content: " +line);
				line = br1.readLine();
			}
			br1.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not fuond error.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("complete excution");
		}

	}

}
