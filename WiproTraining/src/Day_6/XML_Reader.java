package Day_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class XML_Reader {

	public static void main(String[] args) {
		File xml = new File("C:\\Users\\kashi\\Desktop\\first.xml");
		try {
			BufferedReader br = new BufferedReader(new FileReader(xml));
			String line = br.readLine();
			while(line != null) {
				System.out.println("line: " + line);
				line = br.readLine();
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println("Error reading XML file: " + e.getMessage());
		}
		finally {
			System.out.println("Code Executed....");
		}

	}

}
