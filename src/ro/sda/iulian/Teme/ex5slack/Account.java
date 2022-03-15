package ro.sda.iulian.Teme.ex5slack;

public abstract class Account {
    public abstract double getmoney();
}
class AccountA extends Account{

    @Override
    public double getmoney() {
        return 100000;
    }
}
class AccountB extends Account{

    @Override
    public double getmoney() {
        return 150000;
    }
}
class AccountC extends Account{

    @Override
    public double getmoney() {
        return 200000;
    }
}