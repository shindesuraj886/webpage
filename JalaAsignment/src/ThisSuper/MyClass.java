package ThisSuper;
public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

public static void main(String[] args) {
    // Create an object of MyClass
    MyClass myObject = new MyClass(10);

    // You cannot call the constructor again on the same object
    // MyClass myObject2 = myObject(); // This is not valid

    // You can call methods on the object multiple times
    myObject.setValue(20);
    System.out.println("Value after setting it to 20: " + myObject.getValue());

    myObject.setValue(30);
    System.out.println("Value after setting it to 30: " + myObject.getValue());
}
}





