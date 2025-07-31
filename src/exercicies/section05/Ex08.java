package exercicies.section05;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        // Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        // que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        // qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        // Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        // mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        // Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        // salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        // de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        // duas casas decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salary = 0.0, value = 0.0, rest;

        System.out.println("Renda                          | Imposto de Renda");
        System.out.println("de 0.00 a R$ 2000.00           | Isento");
        System.out.println("de R$ 2000.01 até R$ 3000.00   | 8 %");
        System.out.println("de R$ 3000.01 até R$ 4500.00   | 18 %");
        System.out.println("acima de R$ 4500.00            | 28 %");
        System.out.println();
        System.out.println("Digite seu salário: ");
        salary = sc.nextDouble();

        if (salary > 4500.00) {
            value += (salary - 4500.00) * 0.28;
            salary += 4500.00 - salary;
        }
        if (salary >= 3000.01 && salary <= 4500.00) {
            value += (salary - 3000.00) * 0.18;
            salary += 3000.00 - salary;
        }
        if (salary >= 2000.01 && salary <= 3000.00) {
            value += (salary - 2000.00) * 0.08;
        }
        if (salary <= 2000.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", value);
        }

        sc.close();
    }
}
