package section13.polymorphism;

import section13.polymorphism.entities.Account;
import section13.polymorphism.entities.SavingsAccounts;

public class Application {

    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccounts(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }

}
