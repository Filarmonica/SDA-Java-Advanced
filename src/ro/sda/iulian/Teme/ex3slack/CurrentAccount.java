package ro.sda.iulian.Teme.ex3slack;

public class CurrentAccount extends Account {
    private final int overdraftLimit = 1000;
    private double balCurrent;

    public CurrentAccount(int a, double balCurrent) {
        super(a);
        this.balCurrent=balCurrent;
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balCurrent) {
            balCurrent -= sum;
        } else if (sum >= balCurrent+overdraftLimit) {
            System.out.println("Overdraft limit is breached with this withdraw");
        } else {
            System.err.println("Account.withdraw(...): "
                    + "cannot withdraw negative amount.");
        }
    }
}