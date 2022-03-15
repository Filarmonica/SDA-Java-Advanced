package ro.sda.iulian.inheritance.ex1;

public class Main {
    public static void main(String[] args) {
    Shape circle = new Circle(30);
        System.out.println(circle.getPerimetre());
        System.out.println(circle.getArea());

    Shape rectangle = new Rectangle(20,10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimetre());

    }
}
