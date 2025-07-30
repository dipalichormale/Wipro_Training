package Day_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable
{
	private String name;
	private int age;
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student1() {
		super();
	}
	
	
}
public class Serialazation_Deserialazation {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student1 s1=new Student1();
		
		s1.setName("Dipali");
		s1.setAge(23);
		
		FileOutputStream out=new FileOutputStream("C:\\Users\\kashi\\Desktop\\First.txt");
		ObjectOutputStream output=new ObjectOutputStream(out);
		output.writeObject(s1);
		out.close();
		output.close();
		
		FileInputStream in=new FileInputStream("C:\\Users\\kashi\\Desktop\\First.txt");
		ObjectInputStream input=new ObjectInputStream(in);
		Student1 s2=(Student1) input.readObject();

		// print s2's details to verify deserialization
		System.out.println("Deserialized Student Name: " + s2.getName());
		System.out.println("Deserialized Student Age: " + s2.getAge());
				
		in.close();
		input.close();
	}
}
