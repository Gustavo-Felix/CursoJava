package section16.DefaultMethods;

import section16.DefaultMethods.services.BrazilInterestService;
import section16.DefaultMethods.services.InterestService;
import section16.DefaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.print("Payment after " + months + " months: ");
        System.out.printf("%.2f", payment);

        sc.close();
    }
}
