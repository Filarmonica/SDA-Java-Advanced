package ro.sda.iulian.abstractclass.ex2;

/**
 * a. Write an abstract class Shape
 * – Data members: numSides
 * – Constructor: initialize numSides
 * – Concrete method: get method for numSides
 * – Abstract methods: getArea(), getPerimeter()
 * b. Write a concrete subclass Rectangle
 * – Data members: width, height
 * c. Write a concrete subclass Triangle
 * – Data members: width, height
 * In another class, write a main method to define a Rectangle and a Triangle.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 6);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimetre());
        Shape triangle = new Triangle(3,5);
        System.out.println(triangle.getPerimetre());
        System.out.println(triangle.getArea());


    }
}
