package Inheritance;


public class New {

	    public static void main(String[] args) {
	        // Create objects for each class
	        A objectA = new A();
	        B objectB = new B();
	        C objectC = new C();

	        // Call methods for class A
	        objectA.methodA1();
	        objectA.commonMethod();

	        // Call methods for class B
	        objectB.methodA1(); // Inherited from class A
	        objectB.methodB1();
	        objectB.commonMethod(); // Overridden method in class B

	        // Call methods for class C
	        objectC.methodA1(); // Inherited from class A
	        objectC.methodB1(); // Inherited from class B
	        objectC.methodC1();
	        objectC.commonMethod(); // Overridden method in class C

	        // Call overridden method with super class reference
	        A superClassRef = new B();
	        superClassRef.commonMethod(); // Calls overridden method in class B

	        superClassRef = new C();
	        superClassRef.commonMethod(); // Calls overridden method in class C
	    }
}
