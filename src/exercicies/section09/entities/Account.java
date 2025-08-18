package exercicies.section09.entities;

public class Account {
    private final int number;
    private String name;
    private double balance = 0;

    public Account(int number, String name){
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialbalance){
        this.number = number;
        this.name = name;
        deposit(initialbalance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double deposit(double value) {
        return balance += value;
    }

    public double withdraw(double value) {
        return balance -= (value + 5);
    }

    public String toString() {
        return
                "Account "
                + number
                + ", Holder: "
                + name
                + String.format(", Balance: $ %.2f", balance);
    }
}
