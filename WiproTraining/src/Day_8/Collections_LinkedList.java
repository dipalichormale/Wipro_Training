package Day_8;

import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> courses = new LinkedList<String>();
		courses.add("Java");
        courses.add("Python");
        courses.add("Data Science");
        courses.add("Web Development");

        // Display the entire list
        System.out.println("Course List: " + courses);

        // Add a course at the beginning
        courses.addFirst("C Programming");

        // Add a course at the end
        courses.addLast("Machine Learning");

        // Remove one course
        courses.remove("Python");

        // Display final list
        System.out.println("After removing Python: " + courses);
		
		for(String i:courses) {
			String course = (String) i;
			System.out.println(course);
		}

	}

}
