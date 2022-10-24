package solid.shape;

import java.util.List;

public class AreaCalculator {
    public double calcArea(List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calcArea();
        }
        return area;
    }
}