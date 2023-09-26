package Constructor;

 public class ConstructorExample {
	
//	 We have a parent class Parent with both default and one-argument constructors.
//
//	 The child class Child extends the parent class and also has its own 
//	 default and one-argument constructors.
//
//	 In the main method, we instantiate the Child class using both the 
//	 default and one-argument constructors to call constructors of both classes.
//
//	 Within the child class constructors, we use super() to call the constructors of the parent class. 
//	 This allows us to execute the parent class constructors along with the child class constructors.
//	 
//	 
//	 
	 
	 public static void main(String[] args) {
	     // Instantiate the Child class to call its constructors
	     Child child1 = new Child(); // Calls Child's default constructor
	     Child child2 = new Child(42); // Calls Child's one-argument constructor
	 }
	}