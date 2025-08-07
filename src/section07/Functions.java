package section07;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int highter = max(a, b, c);

        showResult(highter);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && y > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Highter = " + value);
    }
}
