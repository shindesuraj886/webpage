package Loop_Program;
import java.util.Scanner;

public class GenderProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.close();

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("You are Male.");
                break;
            case 'F':
            case 'f':
                System.out.println("You are Female.");
                break;
            default:
                System.out.println("Invalid input. Please enter 'M' for Male or 'F' for Female.");
        }
    }
};
