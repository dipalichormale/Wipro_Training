package Day_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_example {

	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\kashi\\Desktop\\JavaP.txt"));
		{
			br.write("This is written using bufferedwriter");
//			br.newLine();
			br.close();
			System.out.println("Written Successfully");

			
		}
	}

}
