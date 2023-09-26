package Loop_Program;


	import java.util.Scanner;
	public class LArgestnoAmongThree {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input three numbers from the user
	        System.out.println("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Enter the third number: ");
	        double num3 = scanner.nextDouble();

	        // Find the largest number among the three
	        double largestNumber = num1; // Assume the first number is the largest initially

	        if (num2 > largestNumber) {
	            largestNumber = num2; // Update if the second number is larger
	        }

	        if (num3 > largestNumber) {
	            largestNumber = num3; // Update if the third number is larger
	        }

	        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largestNumber);

	        scanner.close();
	    }
	}


