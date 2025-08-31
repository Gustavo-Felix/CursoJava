package exercicies.section10.Ex10;

import exercicies.section10.Ex10.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        //no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        //os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        //igual a 6.0 (seis).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String name;
        double gradeA, gradeB, avg = 0.0;

        System.out.print("Quantos alunos serao digitados? ");
        int nStudents = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < nStudents; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
            name = sc.next();
            gradeA = sc.nextDouble();
            gradeB = sc.nextDouble();
            Student student = new Student(name, gradeA, gradeB);
            students.add(student);
        }

        for (int i = 0; i < students.toArray().length; i++) {
            avg = (students.get(i).getGradeA() + students.get(i).getGradeB()) / 2;
            if (avg >= 6.0) {
                System.out.println(students.get(i).getName());
            }
        }

        sc.close();
    }
}
