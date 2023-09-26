package c3_Collection_Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

//	Map is an interface
//	LinkedHashMap - is a class
//	Map is used to store key value pair.
//	Duplicate key is not allowed but value can be duplicate.

//	TreeMap -> Maintains natural sorting order based on key
//	Null key is not allowed but value can be null

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(2, "Aniket");
		tm.put(5, "Omkar");
		tm.put(1, "Pradeep");
		tm.put(22, "Shantanu");
		tm.put(90, "Uday");
		tm.put(50, "Prathamesh");
		tm.put(3, "Tushar");
//		tm.put(null, "Tushar");
		tm.put(8, null);
		tm.put(3, "Rahul");

//		store all keys in set
		Set<Integer> keys_set = tm.keySet();

		for (int temp_key : keys_set) {

			int mapKey = temp_key;
			String mapValue = tm.get(mapKey);
			System.out.println("Key = " + mapKey + "  || Value = " + mapValue);

		}

	}

}
