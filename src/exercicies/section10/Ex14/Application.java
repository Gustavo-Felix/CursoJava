package exercicies.section10.Ex14;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Fazer um programa para ler dois números inteiros M e N, e depois ler
        //uma matriz de M linhas por N colunas contendo números inteiros,
        //podendo haver repetições. Em seguida, ler um número inteiro X que
        //pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        //esquerda, acima, à direita e abaixo de X, quando houver, conforme
        //exemplo.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m, n;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int value = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == value) {
                    System.out.printf("Position %d,%d:\n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d\n", array[i][j-1]);
                    }
                    if (j < array[i].length-1) {
                        System.out.printf("Right: %d\n", array[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.printf("Up: %d\n", array[i-1][j]);
                    }
                    if (i < array.length-1) {
                        System.out.printf("Down: %d\n", array[i+1][j]);
                    }
                }
            }
        }

        sc.close();

    }
}
