package exercicios.section4;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        // mensagem explicativa, conforme exemplos.

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = n1 + n2;

        System.out.println("SOMA = " + result);

        sc.close();
    }
}
