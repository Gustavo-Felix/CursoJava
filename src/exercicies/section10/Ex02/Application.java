package exercicies.section10.Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        //- Imprimir todos os elementos do vetor
        //- Mostrar na tela a soma e a média dos elementos do vetor

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double value, soma = 0.0, media;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] += sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i=0; i<n; i++) {
            value = vect[i];
            System.out.print(" " + value);
        }

        System.out.println();

        System.out.print("SOMA = ");
        for (int i=0; i<n; i++) {
            value = vect[i];
            soma += value;
        }
        System.out.print(" " + soma);

        System.out.println();

        soma = 0.0; // Zerando o valor da variavel "soma" para que seja realizado o exercicio de media

        System.out.print("MEDIA = ");
        for (int i=0; i<n; i++) {
            value = vect[i];
            soma += value;
        }

        media = soma / n;
        System.out.print(" " + media);

        sc.close();
    }
}
