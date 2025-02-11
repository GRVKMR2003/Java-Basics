//Static Variables (Class Variables)
// A static variable is shared among all instances of a class.
// It is initialized only once, at the start of program execution.

//Static Methods
// A static method belongs to the class rather than the instance.
// It can access static variables but cannot access non-static (instance) variables directly.

//Cannot Use this or super in Static Methods
//A static method can be accessed directly using the class name.



class Demo {
    static int count = 0;  // Shared among all objects
    
    Demo() {
        count++;
        System.out.println("Count: " + count);
    }
    
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}


class StaticExample {
    static int num = 10;
    
    static void display() {
        System.out.println("Static Method, num = " + num);
    }

    public static void main(String[] args) {
        StaticExample.display();  // Called without object creation
    }
}


class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside static nested class");
        }
    }
}

public class static {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
