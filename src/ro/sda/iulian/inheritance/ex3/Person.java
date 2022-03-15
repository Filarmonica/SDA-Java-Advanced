package ro.sda.iulian.inheritance.ex3;

import java.util.Date;

public class Person {
    private String name;
    private Date dateofBirth;
    private String gender;

    public Person(String name, Date dateofBirth, String gender) {
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateofBirth=" + dateofBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
