package ThisSuper;

public class Child extends Parent {
    int childField = 20;

    void printFields() {
        System.out.println("Child class field (childField): " + childField);
        System.out.println("Parent class field (parentField) using super: " + super.parentField);
    }
}