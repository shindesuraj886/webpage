package Exception;

// Checked -Compile time Exception-
// Unchecked - Runtime Exception-

//Q. Throw vs Throws
//Q. try catch finally?
//Q. Can we have multiple catch blocks?
//Q. HOw do you handle exceptions in your project

public class Demo3 {

	public static void main(String[] args) {

		int a = 10;

		try {
			int b = a / 0;
			
		} catch (NullPointerException e) {
			System.out.println("I am in NullPointerException catch block");
		}
		catch (ArithmeticException e) {
			System.out.println("I am in ArithmeticException catch block");
		}
		catch (Exception e) {
			System.out.println("I am in Exception catch block");
		}
		finally {
			System.out.println("Always executes");
		}

		
		
		System.out.println("Programm completed");
	}

}
