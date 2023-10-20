package exercisesonPolymorphismAbstractandInterfaces.resizableAndGeometricObject;

public class Circle implements GeometricObject{
    private final double pi = Math.PI;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getParameter() {
        return pi * this.radius * 2;
    }

    @Override
    public double getArea() {
        return pi * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
