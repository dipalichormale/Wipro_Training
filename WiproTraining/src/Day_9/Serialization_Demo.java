package Day_9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable class
class Student2 implements Serializable{	
	private int rollno;
	private String name;
	
	// constructor with parameters
	public Student2(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	// no-argument constructor
	public Student2() {}
	
	// toString() for display
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	// Getters and Setters
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class  Serialization_Demo{
	public static void main(String[] args) throws IOException {
		//Create student object
		Student2 std1 = new Student2();
		std1.setRollno(10);
		std1.setName("Aashay");
		
		try{
			// create file to save object
			FileOutputStream out = new FileOutputStream("C:\\Users\\kashi\\Desktop\\First.txt");
			
			// convert object to byte stream
			ObjectOutputStream output = new ObjectOutputStream(out);
			
			// write object to file
			output.writeObject(std1);
			
			System.out.println("Serialized data saved in file");
			
		    out.close();
		    output.close();
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}
