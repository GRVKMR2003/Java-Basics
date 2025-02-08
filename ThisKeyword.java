//this Keyword in Java
// In Java, the this keyword is a reference variable that refers to the current instance of the class. It is mainly used for the following purposes:

class Example {
    int num;

    Example(int num) {
        this.num = num;  // Refers to instance variable
    }

    void display() {
        System.out.println("Value: " + this.num);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Example obj = new Example(10);
        obj.display();
    }
}
