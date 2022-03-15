package ro.sda.iulian.Teme.ex1slack;

/**
 * Create class Pet.
 * a) Add private fields to the class, like name, age, gender, race, weight.
 * b) Create constructor that accepts all of the class fields.
 * c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
 * d) Create getters and setters for age and weight.
 * e) Create object of class Dog. Verify if everything works as expected.
 * f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
 */
public class Main {
    public static void main(String[] args) {


        Pet pet1 = new Pet("RoRo",5,"male","bichon",12.3);
        Pet pet2 = new Pet("female","chow-chow");
        System.out.println(pet1);
        System.out.println(pet2);
        pet1.setAge(0);
        pet2.setWeight(0);
        System.out.println(pet1);
        System.out.println(pet2);
    }
}