package ro.sda.iulian.Teme.ex3slack;

public class Bank {
    public static void main(String[] args) {


        Account[] accounts = new Account[4];
        accounts[0] = new SavingsAccount(4593,100,0.01,2);
        accounts[1] = new CurrentAccount(4345,100);
        accounts[2] = new SavingsAccount(4593,700,0.1,1);
        accounts[3] = new Account(234234);

    }
}