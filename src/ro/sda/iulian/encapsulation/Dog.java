package ro.sda.iulian.encapsulation;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight){
        this.name=name;
        if (age<0){
            System.err.println("invalid age");
        }else{
            this.age=age;}
        this.gender=gender;
        this.race=race;
        if(weight<0){
            System.err.println("invalid weight");
        }else{
            this.weight=weight;}

    }

    public Dog(String gender, String race){
        this("Rex", 5,gender,race,20.1);
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public void setAge(int age){
        if (age<0){
            System.err.println("invalid age");
        }else{
        this.age=age;}
    }
    public void setWeight(int weight){
        if(weight<0){
            System.err.println("invalid weight");
        }else{
        this.weight=weight;}
    }

    @Override
    public String toString() {
        return "ro.sda.iulian.encapsulation.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
