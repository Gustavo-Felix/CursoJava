package exercicies.section05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        // escreva um programa que leia o código de um item e a quantidade deste item. A
        // seguir, calcule e mostre o valor da conta a pagar

        Scanner sc = new Scanner(System.in);
        int cod, qtd;
        double result = 0;

        System.out.println("CÓDIGO  | ESPECIFICAÇÃO       | PREÇO");
        System.out.println("1       | Cachorro Quente     | R$ 4.00");
        System.out.println("2       | X-Salada            | R$ 4.50");
        System.out.println("3       | X-Bacon             | R$ 5.00");
        System.out.println("4       | Torrada simples     | R$ 2.00");
        System.out.println("5       | Refrigerante        | R$ 1.50");
        System.out.println();
        System.out.println("Escolha baseando no código do produto (coloque a quantidade após o código):");
        cod = sc.nextInt();
        qtd = sc.nextInt();

        if (cod == 1) {
            result = 4.00 * qtd;
        } else if (cod == 2) {
            result = 4.50 * qtd;
        } else if (cod == 3) {
            result = 5.00 * qtd;
        } else if (cod == 4) {
            result = 2.00 * qtd;
        } else if (cod == 5) {
            result = 1.50 * qtd;
        } else {
            System.out.println("Valor informado está inválido!");
        }

        System.out.printf("Total: R$ %.2f", result);

        sc.close();
    }
}
