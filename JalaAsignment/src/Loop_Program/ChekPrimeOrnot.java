package Loop_Program;

import java.util.Scanner;

public class ChekPrimeOrnot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        if (num <= 3) {
            return true; // 2 and 3 are prime numbers
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }

        // Check for prime by testing divisors up to the square root of the number
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true; // If no divisors were found, the number is prime
    }
}

