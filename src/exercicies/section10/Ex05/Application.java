package exercicies.section10.Ex05;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        // o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        // considerando a primeira posição como 0 (zero).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        double bigNumber = 0.0, position = 0.0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            double number = sc.nextInt();
            vect[i] += number;
        }

        for (int i = 1; i < n; i++) {
            if (vect[i-1] <= vect[i]) {
                bigNumber = vect[i];
                position = i;
            }
        }

        System.out.println("MAIOR VALOR = " + bigNumber);
        System.out.println("POSICAO DO MAIOR VALOR = " + position);

        sc.close();
    }
}
