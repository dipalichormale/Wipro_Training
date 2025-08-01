package Day_11;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer1 {

	public static void main(String[] args) throws IOException {
		
		String content =  "This is text write file";
		
		FileWriter file = new FileWriter("C:\\Users\\kashi\\Desktop\\JavaP.txt");
		
		file.write(content);
		file.close();
		
		System.out.println("Data written to file successfully.");
	}

}
