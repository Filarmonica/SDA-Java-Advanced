package ro.sda.iulian.Teme.ex3slack;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(3435467);
        Account account2 = new Account(5465877);

        account1.deposit(10.50);
        account2.deposit(60.3);

        account1.withdraw(11);
        account2.withdraw(30);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println(account1.getBalance());
        System.out.println(account2.getAccountNumber());

        SavingsAccount account3 = new SavingsAccount(2430,40000,0.01,3);
        System.out.println(account3.interestAmount());

    }
}
