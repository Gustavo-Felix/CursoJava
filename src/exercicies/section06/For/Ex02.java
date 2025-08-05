package exercicies.section06.For;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        // Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        // essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < X; i++) {
            int N = sc.nextInt();
            if (N >= 10 && N <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
