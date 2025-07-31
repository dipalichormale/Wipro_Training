package Day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaCollections3 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(Arrays.asList(10,70,40,50,20));
		a.add(30);
		a.add(60);
		System.out.println(a);
		
		// sorting a list
		Collections.sort(a);
		System.out.println("sorted: " +a);
		
		// BinarySearch : searching element in sorted list
		int b = Collections.binarySearch(a, 40);
		System.out.println("Index of 40 in sorted list: " +b);
		
		// revering elements in list
		Collections.reverse(a);
		System.out.println("reversed list: " +a);
		

	}

}
