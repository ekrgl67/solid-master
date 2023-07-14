package main.java.solid.liskovsubstitution.suitable;

public class Test {

    public static void main(String[] args) {

        Shape rectangle=new Rectangle(5,8);
        System.out.println(rectangle.getArea());

        Shape square=new Square(5);
        System.out.println(square.getArea());
    }
    }

