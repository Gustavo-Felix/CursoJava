package exercicies.section10.Ex06;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        // terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        // o vetor C gerado.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vectA = new int[n], vectB = new int[n], vectC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            int numberA = sc.nextInt();
            vectA[i] += numberA;
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            int numberB = sc.nextInt();
            vectB[i] += numberB;
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vectA[i] + vectB[i]);
        }

        sc.close();
    }
}
