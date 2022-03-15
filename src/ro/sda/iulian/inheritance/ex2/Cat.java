package ro.sda.iulian.inheritance.ex2;

public class Cat extends Animal{
    public Cat(int age, double weight){
        super(3,5);
    }

    @Override
    public void yieldVoice() {
        System.out.println("miau");
    }
}


