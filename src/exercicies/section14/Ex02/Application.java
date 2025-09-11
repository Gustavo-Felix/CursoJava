package exercicies.section14.Ex02;

import exercicies.section14.Ex02.model.entities.Account;
import exercicies.section14.Ex02.model.exception.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Enter account data\n");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.next();

            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);


        } catch (WithdrawException e) {
            System.out.print("Withdraw error: " + e.getMessage());
        }

    }
}
