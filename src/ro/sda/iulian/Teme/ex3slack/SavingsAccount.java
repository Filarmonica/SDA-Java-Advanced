package ro.sda.iulian.Teme.ex3slack;

public class SavingsAccount extends Account{
    private double interest;
    private double balSavings;
    private double rate;
    private int numberyears;
    public SavingsAccount(int a, double balSavings,double rate, int numberyears) {
        super(a);
        this.balSavings=balSavings;
        this.rate=rate;
        this.numberyears=numberyears;

    }

    public double getBalSavings() {
        return balSavings;
    }

    public void setBalSavings(double balSavings) {
        this.balSavings = balSavings;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getNumberyears() {
        return numberyears;
    }

    public void setNumberyears(int numberyears) {
        this.numberyears = numberyears;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }
    public double interestAmount(){
        interest=balSavings*rate*numberyears;
        return interest;
    }
    public void deposit(double sum)
    {
        if (sum>0)
            balSavings+=sum;
        else
            System.err.println("SavingsAccount.deposit(...): "
                    +"cannot deposit negative amount.");
    }
    public void withdraw(double sum)
    {
        if (sum>0)
            balSavings-=sum;
        else
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interest=" + interest +
                ", balSavings=" + balSavings +
                ", rate=" + rate +
                ", numberyears=" + numberyears +
                '}';
    }
}
