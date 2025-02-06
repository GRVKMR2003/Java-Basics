//The super keyword in Java is a reference variable that refers to the immediate parent class. It is mainly used to access:

// Superclass Instance Variables (when they are hidden by subclass variables).
// Superclass Methods (when overridden in the subclass).
// Superclass Constructors (to invoke the parent class constructor).



//1. Calling Superclass Instance Variable
class Parent {
    String name = "Parent Class Variable";
}

class Child extends Parent {
    String name = "Child Class Variable";

    void display() {
        System.out.println("Child Variable: " + name);
        System.out.println("Parent Variable: " + super.name); // Using super to access parent variable
    }
}

public class superClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}




//2. Calling Superclass Constructor
class Parent {
    Parent() {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Explicitly calling Parent constructor
        System.out.println("Child Constructor Called");
    }
}

public class superClass {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}




//3. Calling Superclass Method
class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Calling Parent's show() method
        System.out.println("Child Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}


