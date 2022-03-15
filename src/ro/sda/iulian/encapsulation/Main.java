package ro.sda.iulian.encapsulation;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("RoRo",12,"male","boxer",4.2);
        System.out.println(dog);

        dog.setAge(13);
        dog.setWeight(5);
        System.out.println(dog);

        Dog dog2 = new Dog("female","corcitura");
        System.out.println(dog2);


    }
}
