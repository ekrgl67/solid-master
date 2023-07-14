package main.java.solid.liskovsubstitution.nonsuitable;

public class Square extends Rectangle{

    public Square(int edge) {
        super(edge, edge);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
