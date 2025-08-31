package exercicies.section10.Ex03;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        // tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        // bem como os nomes dessas pessoas caso houver.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int n, nMinor;
        double totalHeight, avgHeight, percentageHeight;

        System.out.println("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            names[i] = sc.next();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
        }

        nMinor = 0;
        totalHeight = 0;
        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                nMinor++;
            }
            totalHeight += heights[i];
        }

        avgHeight = totalHeight / n;
        percentageHeight = ((double)nMinor / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentageHeight);

        for(int i=0; i<n; i++) {
            if (ages[i] < 16) {
                System.out.printf("%s\n", ages[i]);
            }
        }

        sc.close();
    }
}
