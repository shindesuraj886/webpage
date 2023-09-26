package ThisSuper;

public class curentA {
    private int value;

    // Default constructor
    public curentA() {
        this(0); // Call the parameterized constructor with a default value of 0
    }

    // Parameterized constructor
    public curentA(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}




