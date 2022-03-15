package ro.sda.iulian.abstractclass.ex1;

public abstract class Bank {
    private static final double TAX_VALUE = 0.15;
    public abstract double getbalance();

    public double getBalanceAfterTaxes(){
        double balance = getbalance();
        double tax = balance * TAX_VALUE;
        double newBalance = balance - tax;
        return newBalance;
    }
}
