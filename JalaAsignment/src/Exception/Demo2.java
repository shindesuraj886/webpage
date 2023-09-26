package Exception;

// Checked -Compile time Exception-
// Unchecked - Runtime Exception-

//Q. Throw vs Throws
//Q. try catch finally?
//Q. Can we have multiple catch blocks?
//Q. HOw do you handle exceptions in your project

public class Demo2 {

	public static void main(String[] args) {

		int a = 10;

		try {
			System.out.println("I am in try block");
			
			int b = a / 0;
			
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("I am in catch block");
		}

		
		
		System.out.println("Programm completed");
	}

}
