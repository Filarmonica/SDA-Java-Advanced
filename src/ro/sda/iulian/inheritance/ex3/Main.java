package ro.sda.iulian.inheritance.ex3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Employee("Mircea", new Date(), "male", 5000, "Mopan", "Brutarie");
        persons[1] = new Student("Misu", new Date(), "male", "Politehnica", 8.0);
        persons[2] = new Employee("Marina", new Date(), "female", 7000, "Chitan", "Vanzari");
        persons[3] = new Student("Alina", new Date(), "male", "Hurmuzachi", 7.5);
        persons[4] = new Employee("Alex", new Date(), "male", 1000, "Profi", "marfa");

        for (Person person : persons) {
            System.out.println(person);
            System.out.println(person.getName());
        }
    }
}
