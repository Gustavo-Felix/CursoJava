package section06;

import java.util.Locale;
import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; N > i; i++){
            int x = sc.nextInt();
            result += x;
        }

        System.out.println(result);
        sc.close();
    }
}
