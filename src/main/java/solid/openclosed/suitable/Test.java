package main.java.solid.openclosed.suitable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Test {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(15);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(circle);

        calculateAreas(shapeList);
    }

    private static void calculateAreas(List<Shape> shapeList) {
        for (Shape shape : shapeList) {
            double area = shape.getArea();
            System.out.println(area);
        }
    }
}
