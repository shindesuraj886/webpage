package MethodOverloading;

// Polymorphism - Single entity many forms.
// One entity having different roles in different cases.

// Q. Types?
// 1. Method overloading - compile time poly - early binding.
// 2. Method overriding - run time poly - late binding.

// 1. Method Overloading - compile time poly - early binding.
//Rules - 1. Method name must be same parameter must be different.
//				i. either no. of parameter must be different
//				ii. either data type of parameter must be different
//				iii. sequence of parameter must be different
// 2. Access specifier of overloaded method can be anything
// 3. Exception thrown can be anything


public class OverloadingDemo1 {

	public void add() {
		int a = 10 + 15;
		System.out.println("Addition = " + a);}

	private void add(int x, int y) {
		int a = x + y;
		System.out.println("Addition = " + a);}
	
	protected void add(int x, int y, int z) {
		int a = x + y+z;
		System.out.println("Addition = " + a);}
	
	void add(float x, int y) {
		double a = x + y;
		System.out.println("Addition = " + a);}
	
	public void add(int x, float y) {
		double a = x + y;
		System.out.println("Addition = " + a);}
	
	public static void main(String[] args) {
		OverloadingDemo1 obj = new OverloadingDemo1();
		obj.add();
		obj.add(10,12);
		obj.add(10.05f,12);
		obj.add(11,22,33);
		
	}
	
	

}
