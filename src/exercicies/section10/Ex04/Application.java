package exercicies.section10.Ex04;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        // tela todos os números pares, e também a quantidade de números pares.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int n, number, total = 0;

        System.out.print("Quantos numeros voce vai digitar?");
        n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            number = sc.nextInt();
            vect[i] += number;
        }

        System.out.println();

        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                total += 1;
            }
        }
        System.out.println();

        System.out.println("QUANTIDADE DE PARES = " + total);

        sc.close();
    }
}
