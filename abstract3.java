abstract class Shape {
    abstract void draw(); // abstract method

    void display() { // concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Circle();  // Upcasting
        s.display();
        s.draw();
    }
}

abstract class Base {
    int x, y;

    void getdata(int a, int b) {
        x = a;
        y = b;
    }

    abstract void display(); // abstract method
}

class Derived extends Base {
    void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.getdata(10, 20);
        d.display();
    }
}
