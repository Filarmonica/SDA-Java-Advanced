package ro.sda.iulian.abstractclass.ex2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        super(4);
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimetre() {
        return 2*(height+width);
    }
}

