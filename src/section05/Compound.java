package section05;

import java.util.Locale;
import java.util.Scanner;

public class Compound {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minute = sc.nextInt();
        double account = 50.00;

        if (minute > 100) {
            account += (minute - 100) * 2.0;
        }

        System.out.printf("Valor da conta = %.2f%n", account);

        sc.close();
    }
}
