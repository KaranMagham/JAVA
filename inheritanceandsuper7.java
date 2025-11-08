class Parent {
    void showMessage() {
        System.out.println("This is the Parent class method.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the Child class method.");
        showMessage(); // calling parent class method
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

class Animal {
    String type = "Animal";
}

class Dog extends Animal {
    String type = "Dog";

    void printType() {
        System.out.println("Child class type: " + type);
        System.out.println("Parent class type: " + super.type); // using super
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printType();
    }
}
