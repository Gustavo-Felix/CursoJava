package exercicies.section08.Ex02;

import exercicies.section08.Ex02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        // Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        // seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        // salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
        // afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
        // projetada abaixo.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();
        System.out.println();
        System.out.print("Employee: " + employee.NetSalary());
        System.out.println();
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.GrossSalary = employee.IncreaseSalary(percentage);
        System.out.println();
        System.out.print("Updated data: " + employee);


    }
}
