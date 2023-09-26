package Astatic;

public class callinstacemetnodinstaticmetd {
//4. Call instance methods in static methods
	static int age;
	static void myage() {
		age=age+20;
	System.out.println("My age is :"+age);
	}
	public static void main(String[] args) {
		System.out.println("df");
		myage();
	}
}
