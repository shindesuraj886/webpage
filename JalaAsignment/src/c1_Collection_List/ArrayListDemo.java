package c1_Collection_List;

import java.util.ArrayList;

//Q. Difference between array and array list?
// features of list/ array list ->

//List -> List is an interface in java.util package
//List -> is used to store collection of elements
//List is growable in nature.
//imp -> List maintains insertion order
//imp -> List allows duplicate values
public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Tushar");
		al.add("Pune");
		al.add(99.2f); // to add elements
		al.add(100);
		al.add(90);
		al.add(55);

		System.out.println("Size of list = " + al.size()); // to get size of array list

		System.out.println("Print single element based on index 2 = " + al.get(2));

		al.remove(6); // to remove element
		System.out.println("Size of list after removing element = " + al.size());
		System.out.println("********************************");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

}
