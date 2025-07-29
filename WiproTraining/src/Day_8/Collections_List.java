package Day_8;

import java.util.List;
import java.util.ArrayList;

public class Collections_List {

	public static void main(String[] args) {
		
		List<Integer> data = new ArrayList<Integer>();
		data.add(11);
		data.add(22);
		data.add(33);
		data.add(44);
		data.add(55);
//		System.out.println(data.get(3));
//		System.out.println(data.indexOf(33));
//		System.out.println(data.size());
		
		for(Object i:data) {
			int data1 = (Integer) i;
			System.out.println(data1);
		}

	}

}
