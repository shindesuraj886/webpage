package ThisSuper;

public class ParentA2 extends ParentA1{
	
	    int childField;

	    // Child class constructor
	    ParentA2(int parentField, int childField) {
	        super(parentField); // Call the parent class constructor
	        this.childField = childField;
	        System.out.println("Child constructor called with values: " + parentField + ", " + childField);
	    }
	}