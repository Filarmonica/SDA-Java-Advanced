package ro.sda.iulian.generics.ex1;

public class GenericMain {
    public static void main(String[] args) {
        Person person1 = new Person("Marius", 10.5);
        Person person2 = new Person("Mihai", 13.5);

        Comparator<Person> comparator = new Comparator<>();
        Comparator<Car> carComparator = new Comparator<>();
        comparator.compare(person1,person2);

        Car car1 = new Car("Ford", 170);
        Car car2 = new Car("Dacia", 200);
        carComparator.compare(car1,car2);
    }
}
