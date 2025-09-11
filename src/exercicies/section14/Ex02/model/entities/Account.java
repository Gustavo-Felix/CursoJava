package exercicies.section14.Ex02.model.entities;

import exercicies.section14.Ex02.model.exception.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws WithdrawException {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance -= amount;
    }

    public void withdraw(Double amount) throws WithdrawException {
        if (withdrawLimit < amount) {
            throw new WithdrawException("The amount exceeds withdraw limit");
        }
        else if (balance < amount) {
            throw new WithdrawException("Not enough balance");
        }

        deposit(amount);

        System.out.print("New Balance: " + getBalance());
    }
}
