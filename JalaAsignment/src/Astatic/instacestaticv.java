package Astatic;

public class instacestaticv {
//rint all the static, instance variables in main method
	    // Static variable
	    static int staticVar = 42;

	    // Instance variable
	    int instanceVar = 10;

	    public static void main(String[] args) {
	        // Access and print the static variable
	        System.out.println("Static variable staticVar: " + staticVar);

	        // Create an instance of the class
	        instacestaticv obj = new instacestaticv();

	        // Access and print the instance variable using the instance
	        System.out.println("Instance variable instanceVar: " + obj.instanceVar);
	    }
	}

