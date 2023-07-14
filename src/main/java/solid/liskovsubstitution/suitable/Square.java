package main.java.solid.liskovsubstitution.suitable;

public class Square implements Shape {

    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    @Override
    public int getArea() {
        return edge * edge;
    }
}
