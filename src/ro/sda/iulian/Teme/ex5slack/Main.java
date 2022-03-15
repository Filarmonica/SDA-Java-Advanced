package ro.sda.iulian.Teme.ex5slack;

public class Main {
    public static void main(String[] args) {
        AccountA account = new AccountA();
        AccountB account1 = new AccountB();
        AccountC account2 = new AccountC();

        System.out.println(account.getmoney());
        System.out.println(account1.getmoney());
        System.out.println(account2.getmoney());
    }
}
