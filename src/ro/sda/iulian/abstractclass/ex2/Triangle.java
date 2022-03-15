package ro.sda.iulian.abstractclass.ex2;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double height,double width) {
        super(3);
        this.height=height;
        this.width=width;
    }

    @Override
    public double getArea() {
        return (height*width) / 2;
    }

    @Override
    public double getPerimetre() {
        return 3 * width;
    }
}
