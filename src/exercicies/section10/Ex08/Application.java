package exercicies.section10.Ex08;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        //aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        //digitado, mostrar a mensagem "NENHUM NUMERO PAR".
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int n, number;
        double avg = 0.0, avgPair = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            number = sc.nextInt();
            vect[i] += number;
            if (vect[i] % 2 == 0) {
                avgPair += 1.0;
            }
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                avg += vect[i];
            }
        }

        double result = avg / avgPair;

        if (result > 0) {
            System.out.println("MEDIA DOS PARES = " + result);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }


        sc.close();
    }
}
