package AccessSpecifiers;

public class AccessDemo {

//	*Access specifier or Access modifiers*
//	4 types
//	
//	1. Public - accessible everywhere.
//	2. Private - accessible within the class only.
//	3. Protected - accessible within the package, and outside the package in child class
//	4. Default - accessible within the package only.

	public void m1() {
		System.out.println("I am in public m1 method.");
	}

	private void m2() {
		System.out.println("I am in private m2 method.");
	}

	protected void m3() {
		System.out.println("I am in protected m3 method.");
	}

	void m4() {
		System.out.println("I am in default m4 method.");
	}

	public static void main(String[] args) {

		AccessDemo obj = new AccessDemo();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

}
