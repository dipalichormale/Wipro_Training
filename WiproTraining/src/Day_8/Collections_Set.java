package Day_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_Set {

	public static void main(String[] args) {
		
		Set<Integer> setData = new HashSet<Integer>();
		setData.add(5);
//		setData.add("heloo");
		setData.add(5);
		setData.add(10);
//		setData.add("hello");
		setData.add(15);
//		System.out.println(setData);
		
		Iterator<Integer> iterator = setData.iterator();
		while(iterator.hasNext()) {
			Integer data = iterator.next();
			System.out.println(data);
		}

	}

}
