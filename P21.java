/*
Write a program using multiple catch statements / predefined Exceptions.
@Febin Sunny
 Roll No: 27
 17-11-2025

*/
import java.util.*;

class Predefined {
    int a, b, c;
    Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a / b;
        System.out.println("Result = " + c);
    }
}

public class P21 {
    public static void main(String args[]) {

        Predefined obj = new Predefined();

        try {
            obj.read();
        } catch (ArithmeticException e1) {
            System.out.println("ArithmeticException: " + e1);
        } catch (InputMismatchException e2) {
            System.out.println("InputMismatchException: " + e2);
        } catch (Exception e3) {
            System.out.println("Exception: " + e3);
        }
    }
}
