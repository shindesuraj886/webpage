package IntefaceAbstraction;

public interface MyInterface {
    // Public field (implicitly)
    int publicField = 42;

    // You cannot use private or protected access modifiers for interface fields
    // private int privateField; // This is not allowed
    // protected int protectedField; // This is not allowed

    // Public method (implicitly)
    void publicMethod();

    // You can declare methods with access modifiers, but they are still public
    // private void privateMethod(); // This is not allowed
    // protected void protectedMethod(); // This is not allowed
}
