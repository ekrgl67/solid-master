package main.java.solid.liskovsubstitution.suitable;

public class Rectangle implements Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return height * width;
    }
}
