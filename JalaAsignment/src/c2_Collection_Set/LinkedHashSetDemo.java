package c2_Collection_Set;

import java.util.LinkedHashSet;
import java.util.Set;

//Q.Compare list and set
//Q. Features of set

// Set is an interface
// Set doesn't allow duplicate values

// LinkedHashSet is a class
// LinkedHashSet maintains insertion order
// LinkedHashSet - allows null values

public class LinkedHashSetDemo {

	public static void main(String[] args) {

//		Set<String> st = new HashSet<String>();
		Set<String> hs1 = new LinkedHashSet<String>();
		hs1.add("Omkar");
		hs1.add("Pradip");
		hs1.add("Uday");
		hs1.add("Prathamesh");
		hs1.add("Tushar");
		hs1.add("Omkar"); // add method to add elements
		hs1.add("Shantanu");
		hs1.add(null);

//		hs.get(0) -> invalid

		//for(DataType tempVariable : list/set/array)
		for (String temp : hs1) {
			System.out.println(temp);
		}

	}

}
