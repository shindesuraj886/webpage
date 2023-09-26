package c2_Collection_Set;

import java.util.Set;
import java.util.TreeSet;

//Q.Compare list and set
//Q. Features of set

// Set is an interface
// Set doesn't allow duplicate values

// TreeSet is a class
// TreeSet maintains natural sorting order (Alphabetic/ ascending order)
// TreeSet - null values not allowed

public class TreeSetDemo {

	public static void main(String[] args) {

//		Set<String> st = new HashSet<String>();
		Set<String> ts = new TreeSet<String>();
		ts.add("Omkar");
		ts.add("Pradip");
		ts.add("Uday");
		ts.add("Prathamesh");
		ts.add("Tushar");
		ts.add("Omkar"); // add method to add elements
		ts.add("Shantanu");
//		hs.add(null); - not allowed

//		hs.get(0) -> invalid

		//for(DataType tempVariable : list/set/array)
		for (String temp : ts) {
			System.out.println(temp);
		}

	}

}
