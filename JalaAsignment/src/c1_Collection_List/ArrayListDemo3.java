package c1_Collection_List;

import java.util.ArrayList;

//Q. Difference between array and array list?
// features of list/ array list ->

//List -> List is an interface in java.util package
//List -> is used to store collection of elements
//List is growable in nature.
//imp -> List maintains insertion order
//imp -> List allows duplicate values
public class ArrayListDemo3 {

	public static void main(String[] args) {

		ArrayList<String> student = new ArrayList<String>();
		student.add("Omkar");
		student.add("Pradip");
		student.add("Uday");
		student.add("Prathamesh");
		student.add("Tushar");
		student.add("Omkar");
//		student.add(123);

//		for (String temp : student) {
//			System.out.println(temp);
//		}
		
		for(int i=student.size()-1; i>=0; i-- ) {
			System.out.println(student.get(i));
		}
		
		
		

	}

}
