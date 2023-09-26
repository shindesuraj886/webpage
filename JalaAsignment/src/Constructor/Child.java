package Constructor;
//Child class
public class Child extends Parent {
	 // Default constructor
	 Child() {
	     // Calling the default constructor of the superclass
	     super();
	     System.out.println("Child class - Default Constructor");
	 }

	 // One-argument constructor
	 Child(int num) {
	     // Calling the one-argument constructor of the superclass
	     super(num);
	     System.out.println("Child class - One-Argument Constructor: " + num);
	 }
	}
