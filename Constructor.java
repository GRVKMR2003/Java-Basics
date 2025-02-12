// Key Features of Constructors:
// Same Name as Class – The constructor must have the same name as the class.
// No Return Type – Unlike methods, constructors do not have a return type (not even void).
// Called Automatically – When an object is created using new, the constructor is invoked automatically.
// Can Be Overloaded – Multiple constructors with different parameters can exist in a class.
// Types of Constructors in Java
// Default Constructor (No-Argument Constructor)
// Parameterized Constructor
// Copy Constructor (Manually Implemented, No Built-in Support)







class DefaultConstructor {
    DefaultConstructor() {  // No parameters
        System.out.println("Default Constructor is called");
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();  // Calls constructor
    }
}



class Student {
    String name;
    int age;

    Student(String n, int a) {  // Parameterized Constructor
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Gaurav", 21);  
        s1.display();
    }
}



class Person {
    String name;
    int age;

    Person(String n, int a) {  // Parameterized constructor
        name = n;
        age = a;
    }

    Person(Person p) {  // Copy Constructor
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Amit", 22);
        Person p2 = new Person(p1);  // Copying values from p1 to p2

        p1.display();
        p2.display();
    }
}







public class Constructor {
    
}
