package main.java.solid.openclosed.suitable;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
