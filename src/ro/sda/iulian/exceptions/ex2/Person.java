package ro.sda.iulian.exceptions.ex2;

import java.time.Instant;

public class Person {

    private String firstName;
    private String lastName;
    private Instant dateofBirth;

    public Person(String firstName, String lastName, Instant dateofBirth) throws Exception {
        this.firstName = firstName;
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("The first name is null or empty!");
        }
        this.lastName = lastName;
        if (dateofBirth == null || dateofBirth.isAfter(Instant.now())) {
            throw new Exception("The date is null or in the future!");
        }
        this.dateofBirth = dateofBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("The first name is null or empty!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Instant getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Instant dateofBirth) throws Exception {
        if (dateofBirth == null || dateofBirth.isAfter(Instant.now())) {
            throw new Exception("The date is null or in the future!");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateofBirth=" + dateofBirth +
                '}';
    }
}