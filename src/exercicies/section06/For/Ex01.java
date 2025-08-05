package exercicies.section06.For;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        // X, se for o caso.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 1 && x <= 1000){
            for (int i=0; x>i; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
