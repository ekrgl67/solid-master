package main.java.solid.liskovsubstitution.nonsuitable;

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(5,8);
        rectangle.setWidth(5);
        rectangle.setHeight(8);

        System.out.println(rectangle.getArea());

        Rectangle rectangleSquare=new Square(5);

        System.out.println(rectangleSquare.getArea());
    }
}
