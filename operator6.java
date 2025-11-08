public class RightShiftDemo {
    public static void main(String[] args) {
        int num = 16;
        int result = num >> 2; // Right shift by 2 positions
        System.out.println("Original number: " + num);
        System.out.println("After Right Shift (num >> 2): " + result);
    }
}

public class LeftShiftDemo {
    public static void main(String[] args) {
        int num = 5;
        int result = num << 2; // Left shift by 2 positions
        System.out.println("Original number: " + num);
        System.out.println("After Left Shift (num << 2): " + result);
    }
}

public class ModulusDemo {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;
        int remainder = a % b;
        System.out.println("Remainder when " + a + " is divided by " + b + " : " + remainder);
    }
}