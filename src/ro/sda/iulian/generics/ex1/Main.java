package ro.sda.iulian.generics.ex1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Marius", 10.5);
        Person person2 = new Person("Mihai", 13.5);
        int result =person1.compareTo(person2);
        if(result==1) {
            System.out.println(person1.getName() + "is taller than" + person2.getName());
        }else if(result==-1) {
            System.out.println(person1.getName() + "is shorter than" + person2.getName());
        }else{
            System.out.println(person1.getName() + "is tall as" + person2.getName());
        }
    }
}
