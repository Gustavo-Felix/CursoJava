package exercicios.section4;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        // decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nf = sc.nextDouble();
        double fh = sc.nextDouble();
        double fs = sc.nextDouble();

        double salary = fh * fs;

        System.out.printf("NUMBER = %f", nf);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f", salary);

        sc.close();
    }
}
