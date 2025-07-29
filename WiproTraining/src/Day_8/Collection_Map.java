package Day_8;

import java.util.Map;
import java.util.HashMap;

public class Collection_Map {

	public static void main(String[] args) {
		
		Map<String, Integer> mapData = new HashMap<String, Integer>();
		mapData.put("A", 10);
		mapData.put("B", 20);
		mapData.put("C", 30);
		mapData.put("D", 40);
		mapData.put("E", 50);
		System.out.println(mapData.keySet());
		System.out.println(mapData.values());
		
		// using keySet() and get() with a for each loop
		for(String key : mapData.keySet()) {
			System.out.println(key+ ":" +mapData.get(key));
		}
		
		//using for each
		mapData.forEach((key, value) -> System.out.println("key:" + key + ", Value: " + value));
	}

}
