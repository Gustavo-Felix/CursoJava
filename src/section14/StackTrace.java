package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program!");

    }

    public static void method() {
        System.out.println("***Method Start***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input Error!");
        }

        System.out.println("***Method End***");

        sc.close();
    }

    public static void method1() {
        System.out.println("***Method1 Start***");

        method();

        System.out.println("***Method1 End***");
    }
}