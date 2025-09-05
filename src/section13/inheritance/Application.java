package section13.inheritance;

import section13.inheritance.entities.Account;
import section13.inheritance.entities.BusinessAccount;
import section13.inheritance.entities.SavingsAccounts;

public class Application {

    public static void main(String[] args) {


        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 0.0 , 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccounts(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount bacc4 = (BusinessAccount) acc2;
        bacc4.loan(100.0);

        // BusinessAccount bacc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bacc5 = (BusinessAccount) acc3;
            bacc5.loan(200.0);
            System.out.print("Loan!");
        }

        if (acc3 instanceof SavingsAccounts) {
            SavingsAccounts bacc5 = (SavingsAccounts) acc3;
            bacc5.updateBalance();
            System.out.print("Update!");
        }

    }

}
