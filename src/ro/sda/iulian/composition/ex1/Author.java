package ro.sda.iulian.composition.ex1;

public class Author {
    private String firstname;
    private String lastName;
    public Author(String firstname, String lastName){
        this.firstname=firstname;
        this.lastName=lastName;

    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
