package Constructor;

//Class with constructors having different access modifiers
public class ConstructorAccessModifiers {
 // Public constructor
//	The default constructor is public and can be called from anywhere.
//
//	The private constructor can only be called from within the class itself.
//
//	The protected constructor can be called from subclasses and classes in the same package.
//
//	The default (package-private) constructor can be called from classes in the same package.
//
//	Keep in mind that making a constructor private or protected is typically used for
//	specific design patterns or to control access to instances of a class.
	
	public ConstructorAccessModifiers() {
     System.out.println("Public constructor");
 }

 // Private constructor
 private ConstructorAccessModifiers(int num) {
     System.out.println("Private constructor with argument: " + num);
 }

 // Protected constructor
 protected ConstructorAccessModifiers(double value) {
     System.out.println("Protected constructor with double: " + value);
 }

 // Default (package-private) constructor
 ConstructorAccessModifiers(String str) {
     System.out.println("Default (package-private) constructor with string: " + str);
 }

 public static void main(String[] args) {
     // Creating instances of the class to call the constructors
     ConstructorAccessModifiers publicObj = new ConstructorAccessModifiers();
     // Private constructor cannot be accessed outside the class:
     // ConstructorAccessModifiers privateObj = new ConstructorAccessModifiers(42);
     ConstructorAccessModifiers protectedObj = new ConstructorAccessModifiers(3.14);
     ConstructorAccessModifiers defaultObj = new ConstructorAccessModifiers("Hello");
 }
}
