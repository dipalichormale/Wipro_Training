package Day_8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections_TreeSet {

	public static void main(String[] args) {
		
		Set<Integer> setData = new TreeSet<Integer>();
		setData.add(10);
//		setData.add("heloo");
		setData.add(5);
		setData.add(10);
//		setData.add("hello");
		setData.add(15);
		System.out.println(setData);
		
		Iterator<Integer> iterator = setData.iterator();
		while(iterator.hasNext()) {
			Integer data = iterator.next();
			System.out.println(data);
		}

	}

}
