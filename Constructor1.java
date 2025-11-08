import java.util.*;
class Cuboid {
    int length, breadth, height;
    Cuboid(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    void volume() {
        System.out.println("Volume of Cuboid = " + (length * breadth * height));
    }
}
class RectangleDefault {
    int length, breadth;
    RectangleDefault() {
        length = 6;
        breadth = 4;
    }

    void area() {
        System.out.println("Area of Rectangle (Default) = " + (length * breadth));
    }
}

class RectangleParam {
    int length, breadth;
    RectangleParam(int l, int b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("Area of Rectangle (Parameterized) = " + (length * breadth));
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5, 4, 3);
        c.volume();
        RectangleDefault r1 = new RectangleDefault();
        r1.area();
        RectangleParam r2 = new RectangleParam(7, 3);
        r2.area();
    }
}
