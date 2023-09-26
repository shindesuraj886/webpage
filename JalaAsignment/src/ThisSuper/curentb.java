package ThisSuper;

public class curentb {

	    public static void main(String[] args) {
	        // Create an object using the default constructor
	    	curentA obj1 = new curentA();
	        System.out.println("Value from default constructor: " + obj1.getValue());

	        // Create an object using the parameterized constructor
	        curentA obj2 = new curentA(42);
	        System.out.println("Value from parameterized constructor: " + obj2.getValue());
	    }
}
