package Day_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections2 {

	public static void main(String[] args) {
		
		//List of student names(can have duplicates)
		System.out.println("---List of Student Names---");
		ArrayList<String> StudentNames = new ArrayList<>();
		StudentNames.add("Dipali");
		StudentNames.add("pranali");
		StudentNames.add("Aashay");
		StudentNames.add("Dipali");
		StudentNames.add("Nia");
		
		for(String a : StudentNames) {
		System.out.println(a);
		}
		System.out.println();
		
		// Set of unique student IDs
		System.out.println("---Unique Student IDs--");
		Set<Integer> StudentIDs = new HashSet<>();
		StudentIDs.add(1001);
		StudentIDs.add(1002);
		StudentIDs.add(1001);
		StudentIDs.add(1003);
		StudentIDs.add(1005);
		
		for(Integer b : StudentIDs) {
			System.out.println(b);
		}
		System.out.println();
		
		// Mapping Student ID to Grade
		System.out.println("---Student IDs and Grades");
		Map<Integer, String> StudentGrades = new HashMap<>();
		StudentGrades.put(1001, "A+");
		StudentGrades.put(1002, "B+");
		StudentGrades.put(1003, "C+");
		StudentGrades.put(1001, "A");    // updates the grade for 1001 to A
		StudentGrades.put(1005, "B-");
		
		for(Integer S : StudentGrades.keySet()) {
			System.out.println(S +":"+ StudentGrades.get(S));
		}
	}

}
