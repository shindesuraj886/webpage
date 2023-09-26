package c2_Collection_Set;

import java.util.HashSet;

//Q.Compare list and set
//Q. Features of set

// Set is an interface
// Set doesn't allow duplicate values

// HashSet is a class
// HashSet is unordered
//HashSet - allows null values

public class HashSetDemo {

	public static void main(String[] args) {

//		Set<String> st = new HashSet<String>();
		HashSet<String> hs = new HashSet<String>();
		hs.add("Omkar");
		hs.add("Pradip");
		hs.add("Uday");
		hs.add("Prathamesh");
		hs.add("Tushar");
		hs.add("Omkar"); // add method to add elements
		hs.add("Shantanu");
		hs.add(null);

//		hs.get(0) -> invalid

		//for(DataType tempVariable : list/set/array)
		for (String temp : hs) {
			System.out.println(temp);
		}

	}

}
