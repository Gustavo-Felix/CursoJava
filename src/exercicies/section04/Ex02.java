package exercicies.section04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        // casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double result = Math.pow(r, 2) * 3.14159;
        System.out.printf("A=%.4f", result);

        sc.close();
    }
}
