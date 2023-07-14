package main.java.solid.openclosed.nonsuitable;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Square square = new Square(5);
        Circle circle = new Circle(6);

        List<Object> objectList = new ArrayList<>();

        objectList.add(square);
        objectList.add(circle);

        calculateAreas(objectList);
    }

    private static void calculateAreas(List<Object> objectList) {

        for (Object object : objectList) {

            if (object instanceof Square) {
                Square square = (Square) object;
                int edge = square.getEdge();

                int area = edge * edge;
                System.out.println(area);
            } else if (object instanceof Circle) {
                Circle circle = (Circle) object;
                int radius = circle.getRadius();

                double area = Math.PI * radius * radius;

                System.out.println(area);

            }
        }
    }
}
