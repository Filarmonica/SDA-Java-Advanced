package ro.sda.iulian.inheritance.ex1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        super(Math.PI*(radius*radius),Math.PI*radius);

        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
