package Abstraction;

public class A2_AbstractResult extends A_DemoAbstract {

	@Override
	public void m2() {
		System.out.println("In overridden method");
	}
	
	public void m3() {
		System.out.println("I am in m3 of result");
	}
	
	
	public static void main(String[] args) {
		
//		A_DemoAbstract obj = new A_DemoAbstract();
		
		//dynamic dispatch
		A_DemoAbstract obj1 = new A2_AbstractResult();
		obj1.m1(); //parent
		obj1.m2(); //child
		System.out.println("****************");
		
		A2_AbstractResult obj2 = new A2_AbstractResult();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
		
	}

}
