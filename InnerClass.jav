//An inner class in Java is a class that is declared inside another class. It is used to logically group classes together, improve encapsulation, and provide better organization. Inner classes have access to the members (including private members) of the outer class.


//Non static
class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); // Create outer class object
        OuterClass.InnerClass inner = outer.new InnerClass(); // Create inner class object
        inner.display();
    }
}


//Static
class OuterClass {
    static class InnerClass {
        void display() {
            System.out.println("Inside Static Inner Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass(); // No need for outer class instance
        inner.display();
    }
}


