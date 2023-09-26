package c3_Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

//	Map is an interface
//	HashMap - is a class
//	Map is used to store key value pair.
//	Duplicate key is not allowed but value can be duplicate.

	
//	HashMap -> Unordered
//	Null key and null value allowed
	
	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<>();

		hm.put("3", "Tushar"); // add value in map
		hm.put("7", "Shantanu");
		hm.put("9", "Pradeep");
		hm.put("2", "Uday");
		hm.put("1", "Prathamesh");
		hm.put("10", "Prashant"); //duplicate key
		hm.put("10", "ZZZZZZZZZZZZ"); //duplicate key
		hm.put(null, "Tushar");
		hm.put("5", null);
		
		hm.put("A", "Tushar"); // duplicate value
		hm.put("X", "Alex");
		hm.put("Y", "Rahul");

//		Pring value from map based on key
		System.out.println("Value = " + hm.get("2"));
		System.out.println("*********************************");

		// store all keys in set
		Set<String> key_set = hm.keySet();

		for (String temp_key : key_set) {

			String mapKey = temp_key;
			String mapValue = hm.get(mapKey);

			System.out.println("Key = " + mapKey + " || Value = " + mapValue);
		}

	}

}
