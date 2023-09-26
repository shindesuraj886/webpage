package IntefaceAbstraction;

public class D1 implements  DI{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("im in d1 of mi");	
	}
public static void main(String[] args) {
	D1 obj=new D1();
	obj.m1();
} 
}
