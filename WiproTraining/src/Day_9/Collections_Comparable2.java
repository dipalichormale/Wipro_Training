package Day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	public int age;
	public String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "Student[age: " + age + ", name: " + name+ "]";
	}
	
	@Override
	public int compareTo(Student o) {
//		if (this.age > otherStudent.age) 
//			return 1; 
//		else 
//			return -1;  
		return 0;
	}
}

public class Collections_Comparable2 {
	  
	  // Comparator to sort Student objects by age
	  static Comparator<Student> com = new Comparator<Student>() {
		public int compare(Student i, Student j) {
			if(i.age > j.age)
				return 1;
			else 
				return -1;
		}
	};

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(22, "Kritika"));
		stud.add(new Student(24, "Aashay"));
		stud.add(new Student(23,"Pranali"));
		Collections.sort(stud, com);
		
		for(Student s : stud) {
			System.out.println(s);
		}
		
	}

}
