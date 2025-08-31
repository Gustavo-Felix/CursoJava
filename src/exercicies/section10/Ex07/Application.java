package exercicies.section10.Ex07;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        // mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        // os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int n;
        double number, avg = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            number = sc.nextDouble();
            vect[i] += number;
            avg += vect[i] / n;
        }

        System.out.println();

        System.out.println("MEDIA DO VETOR = " + avg);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
