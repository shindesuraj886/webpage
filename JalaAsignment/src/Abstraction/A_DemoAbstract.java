package Abstraction;

//Abstraction - data hiding / hiding implementation and showing necessary details

//1. Abstract Class
// Abstract class contain abstract as well as non abstract methods.
// abstract - method without body/implementation.
// Whenever we declare any method as an abstract then we need to declare that class as an abstract

// We can not create object of an abstract class.
// We can achieve partial abstraction by using abstract class.

public abstract class A_DemoAbstract {

	public void m1() {
		System.out.println("I am in m1 method of abstract class. ");
	}

	public abstract void m2();
	
	
//	public static void main(String[] args) {
//		A_DemoAbstract obj = new A_DemoAbstract();
//	}

}
