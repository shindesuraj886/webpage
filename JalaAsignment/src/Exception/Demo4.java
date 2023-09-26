package Exception;

// Checked -Compile time Exception-
// Unchecked - Runtime Exception-

//Q. Throw vs Throws
//Q. try catch finally?
//Q. Final, Finally and Finalize??
//Q. Can we have multiple catch blocks?
//Q. How do you handle exceptions in your project?

public class Demo4 {

	public static void main(String[] args) {

		int a = 10;

		try {
			int b = a / 0;
			
		} catch (Exception  e) {
			System.out.println("I am in Exception catch block");
		}
//		catch (ArithmeticException e) { //unrechable
//			System.out.println("I am in ArithmeticException catch block");
//		}
//		catch (NullPointerException e) {
//			System.out.println("I am in NullPointerException catch block");
//		}
		finally {
			System.out.println("Always executes");
		}

		
		
		
	}

}
