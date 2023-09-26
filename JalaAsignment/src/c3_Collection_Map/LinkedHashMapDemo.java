package c3_Collection_Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

//	Map is an interface
//	LinkedHashMap - is a class
//	Map is used to store key value pair.
//	Duplicate key is not allowed but value can be duplicate.

//	LinkedHashMap -> Maintains insertion order
//	Null key and null value allowed

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(2, "Aniket");
		lhm.put(5, "Omkar");
		lhm.put(1, "Pradeep");
		lhm.put(22, "Shantanu");
		lhm.put(90, "Uday");
		lhm.put(50, "Prathamesh");
		lhm.put(3, "Tushar");
//		lhm.put(null, "Tushar");
//		lhm.put(8, null);

//		store all keys in set
		Set<Integer> keys_set = lhm.keySet();

		for (int temp_key : keys_set) {

			int mapKey = temp_key;
			String mapValue = lhm.get(mapKey);
			System.out.println("Key = " + mapKey + "  || Value = " + mapValue);

		}

	}

}
