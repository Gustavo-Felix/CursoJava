package exercicies.section09;

import exercicies.section09.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        String name, option = "";
        double balance = 0, deposit, withdraw;
        Account account;

        System.out.print("Enter account number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        option = sc.next();
        if (option.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            account = new Account(number, name, balance);
        } else {
            account = new Account(number, name);
        }

        System.out.print("Account data: " + account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Updated account data: " + account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.print("Updated account data: " + account);

        sc.close();
    }
}
