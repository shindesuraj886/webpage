package Loop_Program;

public class VariableScope {
	
	    // Global (class-level) variable
	    static int globalVar = 10;

	    public static void main(String[] args) {
	        // Local variable with the same name as the global variable
	        int globalVar = 20;

	        System.out.println("Local variable: " + globalVar); // Prints the local variable
	        System.out.println("Global variable: " + VariableScope.globalVar); // Access the global variable using the class name
	    }

	    // Another method where the global variable is accessible
	    public static void anotherMethod() {
	        System.out.println("Global variable from another method: " + globalVar);
	    }
	}

