package exercicies.section08.Static;

import exercicies.section08.Static.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarValue, totalDollars;

        System.out.print("What is the dollar price? ");
        dollarValue = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        totalDollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.Conversor(dollarValue, totalDollars));

    }
}
