package exercicies.section08.Class.Ex03;

import exercicies.section08.Class.Ex03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        // Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        // (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        // ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        // para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        // resolver este problema.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.mark1 = sc.nextDouble();
        student.mark2 = sc.nextDouble();
        student.mark3 = sc.nextDouble();

        double result = student.passOrNot();

        if (result >= 60.00) {
            System.out.printf("FINAL GRADE = %.2f", result);
            System.out.println();
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f", result);
            System.out.println();
            System.out.println("FAILED");
            result = 60.00 - result;
            System.out.printf("MISSING %.2f POINTS", result);
        }

        sc.close();
    }
}
