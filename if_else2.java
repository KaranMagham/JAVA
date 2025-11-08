import java.util.*;

public class IfElsePrograms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // A. Greater of Two Numbers
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
            System.out.println("Greater Number = " + a);
        else
            System.out.println("Greater Number = " + b);

        // B. Greatest of Three Numbers
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z)
            System.out.println("Greatest Number = " + x);
        else if (y > z)
            System.out.println("Greatest Number = " + y);
        else
            System.out.println("Greatest Number = " + z);

        // C. Odd or Even
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");

        // D. Pass or Fail
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
