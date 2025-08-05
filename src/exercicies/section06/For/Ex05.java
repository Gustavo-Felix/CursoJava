package exercicies.section06.For;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        // Lembrando que, por definição, fatorial de 0 é 1.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Ni = sc.nextInt();
        int result = 0, Nf = Ni;

        for (int i = 1; i < Ni; i++) {
            result = Nf * (Ni - i);
            Nf = 0;
            Nf += result;
        }

        System.out.println(result);

        sc.close();
    }
}
