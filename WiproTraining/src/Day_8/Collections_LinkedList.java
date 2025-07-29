package Day_8;

import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedList {

	public static void main(String[] args) {
		List<Integer> data = new LinkedList<Integer>();
		data.add(11);
		data.add(22);
		data.add(33);
		data.add(44);
		data.add(55);
		System.out.println(data.get(3));
		System.out.println(data.indexOf(33));
		System.out.println(data.size());
		
		for(Object i:data) {
			int data1 = (Integer) i;
			System.out.println(data1);
		}

	}

}
