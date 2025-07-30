package exercicios.section4;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        // mostre:
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, ATR, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        ATR = A * C / 2.0;
        CIRCULO = 3.14159 * C * C;
        TRAPEZIO = (A + B) / 2.0 * C;
        QUADRADO = B * B;
        RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", ATR);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        sc.close();
    }
}
