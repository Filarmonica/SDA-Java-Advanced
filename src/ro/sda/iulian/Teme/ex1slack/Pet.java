package ro.sda.iulian.Teme.ex1slack;

public class Pet {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Pet (String name, int age, String gender,String race,double weight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.race=race;
        this.weight=weight;

    }
    public Pet(String gender, String race){
        this ("Zdreanta",12,gender, race,50.0);
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<=0){
            System.out.println("Invalid Age");
        }else{
        this.age=age;
    }}
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("Invalid weight");
        } else {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
