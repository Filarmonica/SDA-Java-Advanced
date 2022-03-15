package ro.sda.iulian.inheritance.ex1;

public class Shape {
    private double area;
    private double perimetre;

    public Shape(double area, double perimetre){
        this.area = area;
        this.perimetre=perimetre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimetre=" + perimetre +
                '}';
    }
}
