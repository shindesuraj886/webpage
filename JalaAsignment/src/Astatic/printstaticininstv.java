package Astatic;

public class printstaticininstv {

	static int age;
	public void myage() {
		age=age+20;
	System.out.println("My age is :"+age);
	}
public static void main(String[] args) {
	printstaticininstv sv=new printstaticininstv();
	sv.myage();
}
}
