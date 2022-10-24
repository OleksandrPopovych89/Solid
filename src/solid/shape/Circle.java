package solid.shape;

public class Circle extends Shape {
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return radius * radius * Math.PI;
    }
}