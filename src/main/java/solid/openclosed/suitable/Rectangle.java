package main.java.solid.openclosed.suitable;

public class Rectangle implements Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (length < 0 || height < 0) ? 0 : (length * height);
    }
}