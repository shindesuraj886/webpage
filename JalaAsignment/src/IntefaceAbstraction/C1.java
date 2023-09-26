package IntefaceAbstraction;

public  class C1 implements CI ,AI {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("im inm1 of c");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("im inm2 of c1");

	}

	@Override
	public void mi() {
		// TODO Auto-generated method stub
		System.out.println("im in mi of c1");

	}

	public static void main(String[] args) {
		C1 obj=new C1();
		obj.mi();
		obj.m2();
		obj.m2();
	}


}
