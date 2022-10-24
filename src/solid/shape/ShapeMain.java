package solid.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.setRadius(10);
        rectangle.setHeight(10);
        rectangle.setWidth(20);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calcArea(shapes));
    }
}
