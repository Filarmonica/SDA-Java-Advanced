package ro.sda.iulian.inheritance.ex2;

public class Dog extends Animal{
    public Dog(int age, double weight){
        super(2,10);
    }

    @Override
    public void yieldVoice() {
        System.out.println("woof");
    }
}
