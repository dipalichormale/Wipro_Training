package Day_4;

import java.util.Arrays; 
import java.util.Collections;

public class SortedArray {

	
	    public static void main(String[] args) {
	        String[] names = {
	        		"Charlie", 
	        		"Alice", 
	        		"Bob", 
	        		"David", 
	        		"Eve"
	        		};

	        System.out.println("Original names:");
	        printArray(names);

	        // Bubble Sort implementation
	        for (int i = 0; i < names.length - 1; i++) {
	            for (int j = 0; j < names.length - 1 - i; j++) {
	                
	                if (names[j].compareTo(names[j + 1]) > 0) {
	                    // Swap elements if they are in the wrong order
	                    String temp = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("\nSorted names (Ascending):");
	        printArray(names);
	    }

	    // Helper method to print the array
	    public static void printArray(String[] arr) {
	        for (String name : arr) {
	            System.out.print(name + " ");
	        }
	        System.out.println();
	    }

}
