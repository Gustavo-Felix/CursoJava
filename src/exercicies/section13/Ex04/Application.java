package exercicies.section13.Ex04;

import exercicies.section13.Ex04.entities.Company;
import exercicies.section13.Ex04.entities.Individual;
import exercicies.section13.Ex04.entities.TaxPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<TaxPlayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data: \n", i+1);

            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();

            if (option == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);
            }
            if (option == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                Company company = new Company(name, anualIncome, numberOfEmployees);
                list.add(company);
            }
        }

        System.out.print("TAXES PAID:\n");
        double totoalTax = 0.0;
        for (TaxPlayer p : list) {
            System.out.printf("%s: $ %.2f \n", p.getName(), p.tax());
            totoalTax += p.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f", totoalTax);
    }
}
