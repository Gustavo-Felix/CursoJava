package exercicios.session4;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, np1, np2;
        double price1, price2;

        cod1 = sc.nextInt();
        np1 = sc.nextInt();
        price1 = sc.nextDouble();

        cod2 = sc.nextInt();
        np2 = sc.nextInt();
        price2 = sc.nextDouble();

        double result = np1 * price1 + np2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", result);

        sc.close();
    }
}
