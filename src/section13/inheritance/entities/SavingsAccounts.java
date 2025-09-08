package section13.inheritance.entities;

public class SavingsAccounts extends Account {

    private Double interestingRate;

    public SavingsAccounts() {
        super();
    }

    public SavingsAccounts(Integer number, String holder, Double balance, Double interestingRate) {
        super(number, holder, balance);
        this.interestingRate = interestingRate;
    }

    public Double getInterestingRate() {
        return interestingRate;
    }

    public void setInterestingRate(Double interestingRate) {
        this.interestingRate = interestingRate;
    }

    public void updateBalance() {
        balance += balance * interestingRate;
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}
