package Constructor;

//constructor - Constructor is special method whose name is same as class name
// Constructor should not have any return type
// whenever we are not writing any constructor then default constructor will be inserted by JVM.
// Constructor will be invoked/called by JVM automatically when we create an object

public class Student {
	
	
	public Student() { //constructor
		//default constructor
		System.out.println("I am in student constructor.");
	}
	
	public void Student() { //method
		System.out.println("I am in student method");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
//		obj.Student();
		
	}

}
